import { Text, View, StyleSheet, Image, Button } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';

export default function HomeScreen({navigation}) {

  return (
     <View style={styles.container}>
    <LinearGradient colors={['#778899', '#363636']} // Gradiente no botão
          style={styles.button}
         
        >
   
    
      <Text style={styles.tituloserio}>
        Bem vindo ao nosso site sério.
      </Text>

   
    </LinearGradient>
    <br/>
    <Text style={styles.paragroserio}> O nosso site sério é focado em seriedades super sérias sériamente estudadas e focadas sériamente.</Text>
    <br/>
    <Image style={styles.imagem} source={require('../Imagens/serio.png')}/>
    <Button title="Sobre nossas seriedades" onPress={()=> navigation.navigate("About")}/>
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

