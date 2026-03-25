import { Text, View, StyleSheet, Image, Button } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';

export default function HomeScreen({navigation}) {

  return (
     <View style={styles.container}>
    <LinearGradient colors={['#778899', '#363636']} // Gradiente no botão
          style={styles.button}
         
        >
   
    
      <Text style={styles.tituloserio}>
        Quais são nossos serviços sérios?
      </Text>

   
    </LinearGradient>
    <br/>
    <Text style={styles.paragroserio}> Nós COM CERTEZA temos uma gama de serviços sérios para oferecer aos nossos clientes, nós analisamos sériamente os problemas sérios do mundo para resolvê-los seriamente, como a criação do gato Jeffersônico.</Text>
    <br/>
    <Image style={styles.imagem} source={require('../Imagens/GatoJefferson.jpg')}/>
      <Button title="Nossos sérios contatos" onPress={()=> navigation.navigate("Contact")}/>
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
    width: 195,
    height:195,
  },
});

