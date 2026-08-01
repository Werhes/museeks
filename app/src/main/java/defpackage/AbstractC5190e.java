package defpackage;

import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5190e {
    public static final double[][] ad = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] vip = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] metrica = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] license = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final kotlin.jvm.functions.Function0 r37, defpackage.InterfaceC12864e r38, defpackage.C11627e r39, defpackage.C18439e r40, defpackage.C2315e r41, defpackage.C5069e r42, defpackage.C4819e r43, defpackage.C15274e r44, final defpackage.C2892e r45, defpackage.C13770e r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5190e.ad(kotlin.jvm.functions.Function0, eّۤۧ, eٌِۛ, eؘۢ, eؔؑ۠, eٍٟؗ, eِٖؗ, eؘٕؕ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d8, code lost:
    
        if (r0[r27] > 100.01d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01df, code lost:
    
        if (r0[2] <= 100.01d) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e2, code lost:
    
        r0 = (defpackage.AbstractC8210e.license(r0[2]) & 255) | ((((defpackage.AbstractC8210e.license(r4) & 255) << 16) | (-16777216)) | ((defpackage.AbstractC8210e.license(r0[r27]) & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01c9, code lost:
    
        r4 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d2, code lost:
    
        if (r4 > 100.01d) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int adcel(double r41, double r43, double r45) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5190e.adcel(double, double, double):int");
    }

    public static final int advert(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static double appmetrica(double d) {
        double pow = Math.pow(Math.abs(d), 0.42d);
        return (((d < 0.0d ? -1 : d == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static double billing(double[] dArr) {
        double[] appmetrica = AbstractC5851e.appmetrica(dArr, ad);
        double appmetrica2 = appmetrica(appmetrica[0]);
        double appmetrica3 = appmetrica(appmetrica[1]);
        double appmetrica4 = appmetrica(appmetrica[2]);
        return Math.atan2(((appmetrica2 + appmetrica3) - (appmetrica4 * 2.0d)) / 9.0d, ((((-12.0d) * appmetrica3) + (appmetrica2 * 11.0d)) + appmetrica4) / 11.0d);
    }

    public static boolean license(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final void metrica(InterfaceC8046e interfaceC8046e, C13770e c13770e, int i, int i2) {
        C13770e c13770e2;
        c13770e.m3671package(1705706247);
        int i3 = (((i2 & 1) == 0 && c13770e.yandex(interfaceC8046e)) ? 4 : 2) | i;
        if (c13770e.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
                int i4 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                interfaceC8046e = ((C3247e) c13770e.adcel(AbstractC4449e.appmetrica)).tapsense;
            }
            c13770e.admob();
            InterfaceC7189e metrica2 = AbstractC10589e.metrica(C17043e.ad);
            C5782e advert = AbstractC14430e.advert(AbstractC0933e.metrica);
            c13770e2 = c13770e;
            AbstractC11613e.ad(metrica2.purchase(new C4293e(advert, advert, advert, advert)), C7139e.license, AbstractC16653e.license(-2026655771, new C3450e(27, interfaceC8046e), c13770e), c13770e2, 384, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C13752e(interfaceC8046e, i, i2);
        }
    }

    public static double mopub(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static int purchase(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    public static boolean startapp(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    public static final void vip(C2892e c2892e, C2892e c2892e2, Function2 function2, C13770e c13770e, int i) {
        c13770e.m3671package(-52757249);
        int i2 = (c13770e.yandex(c2892e) ? 4 : 2) | i | (c13770e.yandex(c2892e2) ? 32 : 16) | (c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C15492e c15492e = AbstractC17878e.ad;
            AbstractC10600e.ad(((C10375e) c13770e.adcel(c15492e)).yandex, AbstractC16653e.license(-64505424, new C7099e(c2892e, 3), c13770e), c13770e, 48);
            AbstractC10600e.ad(((C10375e) c13770e.adcel(c15492e)).advert, AbstractC16653e.license(167446503, new C7099e(c2892e2, 4), c13770e), c13770e, 48);
            AbstractC10600e.ad(((C10375e) c13770e.adcel(c15492e)).advert, AbstractC16653e.license(-1736013592, new C2920e(function2, 3, (byte) 0), c13770e), c13770e, 48);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11581e(c2892e, c2892e2, function2, i);
        }
    }

    public static double yandex(double d) {
        double abs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d < 0.0d ? -1 : d == 0.0d ? 0 : 1);
    }
}
