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
    <Text style={styles.paragroserio}> Nossos contatos: 
    <br/>

    Instagram: @empresa_seriedades
    <br/>

    Whatsapp: +55 11 9666-6669
    
    </Text>

    <Image style={styles.imagem} source={require('../Imagens/SuitCatSerio.png')}/>
      <Button title="             Página final           " onPress={()=> navigation.navigate("Final")}/>
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
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'justify',
  },
  imagem:{
    width: 200,
    height:200,
  },
});

