package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class remoteconfig extends AbstractC4068e {
    public final /* synthetic */ int metrica;

    @Override // defpackage.AbstractC4068e
    public final AbstractC0362e ad() {
        int i = 25;
        switch (this.metrica) {
            case 0:
                return new C17328e(new BigInteger(1, AbstractC7240e.metrica("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03")), new BigInteger(1, AbstractC7240e.metrica("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00")), new BigInteger(1, AbstractC7240e.metrica("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F")), new BigInteger(1, AbstractC7240e.metrica("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1")), BigInteger.valueOf(1L), true);
            case 1:
                BigInteger bigInteger = new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16);
                new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16);
                return AbstractC11301e.vip(new C4288e(), new C16911e(bigInteger, new C4813e(new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), 272), i));
            case 2:
                return new C13801e();
            case 3:
                return new C1936e();
            case 4:
                return new C9469e();
            case 5:
                return new C17640e();
            case 6:
                return new C10908e();
            case 7:
                return new C8828e();
            case 8:
                return new C14788e();
            case 9:
                return new C14245e();
            case 10:
                return new C12064e();
            case 11:
                return new C7922e();
            case 12:
                return new C12611e();
            case 13:
                return new C5347e();
            case 14:
                return new C12912e();
            case 15:
                return new C1551e();
            case 16:
                return new C15310e();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C5997e();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C2013e();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C13332e();
            case 20:
                return new C10160e();
            case 21:
                return new C3931e();
            case 22:
                return new C8818e();
            case 23:
                return new C2033e();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C10391e();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C3486e();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                BigInteger bigInteger2 = new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16);
                new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16);
                return AbstractC11301e.vip(new C2605e(), new C16911e(bigInteger2, new C4813e(new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), 176), i));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C15334e();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C5818e();
            default:
                BigInteger bigInteger3 = new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16);
                new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16);
                return AbstractC11301e.vip(new C13833e(), new C16911e(bigInteger3, new C4813e(new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), 208), i));
        }
    }

    @Override // defpackage.AbstractC4068e
    public final C9300e vip() {
        switch (this.metrica) {
            case 0:
                AbstractC0362e ad = ad();
                C1324e c1324e = new C1324e(ad, AbstractC7240e.metrica("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"));
                AbstractC0903e.vip(c1324e.loadAd());
                return new C9300e(ad, c1324e, ad.license, ad.appmetrica, null);
            case 1:
                AbstractC0362e metrica = metrica();
                return new C9300e(metrica, AbstractC11301e.ad(metrica, "0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8"), metrica.license, metrica.appmetrica, null);
            case 2:
                byte[] metrica2 = AbstractC7240e.metrica("C49D360886E704936A6678E1139D26B7819F7E90");
                AbstractC0362e metrica3 = metrica();
                return new C9300e(metrica3, AbstractC11301e.ad(metrica3, "046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5"), metrica3.license, metrica3.appmetrica, metrica2);
            case 3:
                byte[] metrica4 = AbstractC7240e.metrica("A335926AA319A27A1D00896A6773A4827ACDAC73");
                AbstractC0362e metrica5 = metrica();
                return new C9300e(metrica5, AbstractC11301e.ad(metrica5, "04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F"), metrica5.license, metrica5.appmetrica, metrica4);
            case 4:
                byte[] metrica6 = AbstractC7240e.metrica("D09E8800291CB85396CC6717393284AAA0DA64BA");
                AbstractC0362e metrica7 = metrica();
                return new C9300e(metrica7, AbstractC11301e.ad(metrica7, "0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650"), metrica7.license, metrica7.appmetrica, metrica6);
            case 5:
                byte[] metrica8 = AbstractC7240e.metrica("10E723AB14D696E6768756151756FEBF8FCB49A9");
                AbstractC0362e metrica9 = metrica();
                return new C9300e(metrica9, AbstractC11301e.ad(metrica9, "04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"), metrica9.license, metrica9.appmetrica, metrica8);
            case 6:
                byte[] metrica10 = AbstractC7240e.metrica("10C0FB15760860DEF1EEF4D696E676875615175D");
                AbstractC0362e metrica11 = metrica();
                return new C9300e(metrica11, AbstractC11301e.ad(metrica11, "0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"), metrica11.license, metrica11.appmetrica, metrica10);
            case 7:
                byte[] metrica12 = AbstractC7240e.metrica("4D696E676875615175985BD3ADBADA21B43A97E2");
                AbstractC0362e metrica13 = metrica();
                return new C9300e(metrica13, AbstractC11301e.ad(metrica13, "040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"), metrica13.license, metrica13.appmetrica, metrica12);
            case 8:
                byte[] metrica14 = AbstractC7240e.metrica("985BD3ADBAD4D696E676875615175A21B43A97E3");
                AbstractC0362e metrica15 = metrica();
                return new C9300e(metrica15, AbstractC11301e.ad(metrica15, "040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"), metrica15.license, metrica15.appmetrica, metrica14);
            case 9:
                AbstractC0362e metrica16 = metrica();
                return new C9300e(metrica16, AbstractC11301e.ad(metrica16, "0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9"), metrica16.license, metrica16.appmetrica, null);
            case 10:
                byte[] metrica17 = AbstractC7240e.metrica("24B7B137C8A14D696E6768756151756FD0DA2E5C");
                AbstractC0362e metrica18 = metrica();
                return new C9300e(metrica18, AbstractC11301e.ad(metrica18, "040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"), metrica18.license, metrica18.appmetrica, metrica17);
            case 11:
                AbstractC0362e metrica19 = metrica();
                return new C9300e(metrica19, AbstractC11301e.ad(metrica19, "042AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD245A20AE19A1B8A086B4E01EDD2C7748D14C923D4D7E6D7C61B229E9C5A27ECED3D9"), metrica19.license, metrica19.appmetrica, null);
            case 12:
                byte[] metrica20 = AbstractC7240e.metrica("85E25BFE5C86226CDB12016F7553F9D0E693A268");
                AbstractC0362e metrica21 = metrica();
                return new C9300e(metrica21, AbstractC11301e.ad(metrica21, "0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1"), metrica21.license, metrica21.appmetrica, metrica20);
            case 13:
                byte[] metrica22 = AbstractC7240e.metrica("103FAEC74D696E676875615175777FC5B191EF30");
                AbstractC0362e metrica23 = metrica();
                return new C9300e(metrica23, AbstractC11301e.ad(metrica23, "0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05"), metrica23.license, metrica23.appmetrica, metrica22);
            case 14:
                byte[] metrica24 = AbstractC7240e.metrica("10B7B4D696E676875615175137C8A16FD0DA2211");
                AbstractC0362e metrica25 = metrica();
                return new C9300e(metrica25, AbstractC11301e.ad(metrica25, "0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C"), metrica25.license, metrica25.appmetrica, metrica24);
            case 15:
                AbstractC0362e metrica26 = metrica();
                return new C9300e(metrica26, AbstractC11301e.ad(metrica26, "04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"), metrica26.license, metrica26.appmetrica, null);
            case 16:
                byte[] metrica27 = AbstractC7240e.metrica("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
                AbstractC0362e metrica28 = metrica();
                return new C9300e(metrica28, AbstractC11301e.ad(metrica28, "0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052"), metrica28.license, metrica28.appmetrica, metrica27);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC0362e metrica29 = metrica();
                return new C9300e(metrica29, AbstractC11301e.ad(metrica29, "0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA"), metrica29.license, metrica29.appmetrica, null);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC0362e metrica30 = metrica();
                return new C9300e(metrica30, AbstractC11301e.ad(metrica30, "040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259"), metrica30.license, metrica30.appmetrica, null);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                byte[] metrica31 = AbstractC7240e.metrica("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
                AbstractC0362e metrica32 = metrica();
                return new C9300e(metrica32, AbstractC11301e.ad(metrica32, "0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4"), metrica32.license, metrica32.appmetrica, metrica31);
            case 20:
                AbstractC0362e metrica33 = metrica();
                return new C9300e(metrica33, AbstractC11301e.ad(metrica33, "040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B"), metrica33.license, metrica33.appmetrica, null);
            case 21:
                byte[] metrica34 = AbstractC7240e.metrica("4099B5A457F9D69F79213D094C4BCD4D4262210B");
                AbstractC0362e metrica35 = metrica();
                return new C9300e(metrica35, AbstractC11301e.ad(metrica35, "04015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A70061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706"), metrica35.license, metrica35.appmetrica, metrica34);
            case 22:
                byte[] metrica36 = AbstractC7240e.metrica("000E0D4D696E6768756151750CC03A4473D03679");
                AbstractC0362e metrica37 = metrica();
                return new C9300e(metrica37, AbstractC11301e.ad(metrica37, "04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83"), metrica37.license, metrica37.appmetrica, metrica36);
            case 23:
                AbstractC0362e metrica38 = metrica();
                return new C9300e(metrica38, AbstractC11301e.ad(metrica38, "04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3"), metrica38.license, metrica38.appmetrica, null);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                byte[] metrica39 = AbstractC7240e.metrica("2AA058F73A0E33AB486B0F610410C53A7F132310");
                AbstractC0362e metrica40 = metrica();
                return new C9300e(metrica40, AbstractC11301e.ad(metrica40, "040303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B"), metrica40.license, metrica40.appmetrica, metrica39);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC0362e metrica41 = metrica();
                return new C9300e(metrica41, AbstractC11301e.ad(metrica41, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), metrica41.license, metrica41.appmetrica, null);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC0362e metrica42 = metrica();
                return new C9300e(metrica42, AbstractC11301e.ad(metrica42, "043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE"), metrica42.license, metrica42.appmetrica, null);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                byte[] metrica43 = AbstractC7240e.metrica("1053CDE42C14D696E67687561517533BF3F83345");
                AbstractC0362e metrica44 = metrica();
                return new C9300e(metrica44, AbstractC11301e.ad(metrica44, "044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32"), metrica44.license, metrica44.appmetrica, metrica43);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                byte[] metrica45 = AbstractC7240e.metrica("B99B99B099B323E02709A4D696E6768756151751");
                AbstractC0362e metrica46 = metrica();
                return new C9300e(metrica46, AbstractC11301e.ad(metrica46, "0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E"), metrica46.license, metrica46.appmetrica, metrica45);
            default:
                AbstractC0362e metrica47 = metrica();
                return new C9300e(metrica47, AbstractC11301e.ad(metrica47, "04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D"), metrica47.license, metrica47.appmetrica, null);
        }
    }
}
