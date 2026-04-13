import { Text, View, StyleSheet, Image, Button } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';

export default function HomeScreen({navigation}) {

  return (
     <View style={styles.container}>
    <LinearGradient colors={['#778899', '#363636']} // Gradiente no botão
          style={styles.button}
         
        >
      <Text style={styles.tituloserio}>
        Página final seriamente séria
      </Text>
    </LinearGradient>
    <Text style={styles.paragroserio}> Para finalizar, não pense que este site e seu conteúdo seja apenas encheção de linguiça para a realização dessa atividade, somos uma empresa séria e de sério respeito.
    
    </Text>

    <Image style={styles.imagem} source={require('../Imagens/MiniCat.jfif')}/>
  
      <Button title="                   Home                  " onPress={()=> navigation.navigate("Home")}/>
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

