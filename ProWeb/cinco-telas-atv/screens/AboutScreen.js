import { Text, View, StyleSheet, Image, Button } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';

export default function HomeScreen({navigation}) {

  return (
     <View style={styles.container}>
    <LinearGradient colors={['#778899', '#363636']} // Gradiente no botão
          style={styles.button}
         
        >
   
    
      <Text style={styles.tituloserio}>
        Quem somos nós? (Nossa apresentação séria).
      </Text>

   
    </LinearGradient>
    <br/>
    <Text style={styles.paragroserio}> Somos uma coorporação seriamente focada em sérios assuntos da séria existência humana.</Text>
    <br/>
    <Image style={styles.imagem} source={require('../Imagens/GatoDeTerno.jpg')}/>
    
      <Button title="  Nossos Serviços sérios  " onPress={()=> navigation.navigate("Services")}/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    alignItems: 'center',
    width: '100%',
    backgroundColor: '#F0F8FF',
    height: '100%',

  },
  tituloserio: {
    margin: 24,
    marginTop: 14,
    fontSize: 28,
    fontWeight: 'bold',
    textAlign: 'justify',
    color: 'white',
  },
  paragroserio: {
    margin: 24,
    marginTop: 14,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'justify',
  },
  imagem:{
    width: 200,
    height:200,
  },
});

