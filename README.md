# PAMPontoCiclo---OFC


https://stackoverflow.com/questions/25256541/android-shakesensor-service-for-shake-detection-in-application-background
https://androiddevbr.wordpress.com/2012/11/25/acelerometro-no-android/


<p> Lista de Atividades </p>
- 1 meta:

- Acelerometro


public class MainActivity extends Activity implements SensorEventListener {
     
    private TextView textViewX;
    private TextView textViewY;
    private TextView textViewZ;
    private TextView textViewDetail;
     
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        textViewX = (TextView) findViewById(R.id.text_view_x);
        textViewY = (TextView) findViewById(R.id.text_view_y);
        textViewZ = (TextView) findViewById(R.id.text_view_z);
        textViewDetail = (TextView) findViewById(R.id.text_view_detail);
         
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
         
    }
       
    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }
     
    @Override
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }
     
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
 
    @Override
    public void onSensorChanged(SensorEvent event) {
        Float x = event.values[0];
        Float y = event.values[1];
        Float z = event.values[2];
         
         /*
        Os valores ocilam de -10 a 10.
        Quanto maior o valor de X mais ele ta caindo para a esquerda - Positivo Esqueda 
        Quanto menor o valor de X mais ele ta caindo para a direita  - Negativo Direita
        Se o valor de  X for 0 então o celular ta em pé - Nem Direita Nem Esquerda
        Se o valor de Y for 0 então o cel ta "deitado"
         Se o valor de Y for negativo então ta de cabeça pra baixo, então quanto menor y mais ele ta inclinando pra ir pra baixo
        Se o valor de Z for 0 então o dispositivo esta reto na horizontal.
        Quanto maioro o valor de Z Mais ele esta inclinado para frente
        Quanto menor o valor de Z Mais ele esta inclinado para traz.
        */
        textViewX.setText("Posição X: " + x.intValue() + " Float: " + x);
        textViewY.setText("Posição Y: " + y.intValue() + " Float: " + y);
        textViewZ.setText("Posição Z: " + z.intValue() + " Float: " + z);
         
        if(y < 0) { // O dispositivo esta de cabeça pra baixo
            if(x > 0)  
                textViewDetail.setText("Virando para ESQUERDA ficando INVERTIDO");
            if(x < 0)  
                textViewDetail.setText("Virando para DIREITA ficando INVERTIDO");   
        } else {
            if(x > 0)  
                textViewDetail.setText("Virando para ESQUERDA ");
            if(x < 0)  
                textViewDetail.setText("Virando para DIREITA ");
        }   
    }
}
