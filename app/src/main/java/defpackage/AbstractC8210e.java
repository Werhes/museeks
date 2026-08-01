package defpackage;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8210e {
    public static final double[][] ad = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] vip = {95.047d, 100.0d, 108.883d};
    public static final byte[] metrica = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] license = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.C6032e r72, defpackage.C16305e r73, defpackage.C10375e r74, defpackage.C2892e r75, defpackage.C13770e r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8210e.ad(eؘۣۤ, eٖٙۜ, eَٛۖ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public static double adcel(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d2 * d2 * d2;
        if (d3 <= 0.008856451679035631d) {
            d3 = ((116 * d2) - 16) / 903.2962962962963d;
        }
        return d3 * 100.0d;
    }

    public static double appmetrica(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16) / 116;
    }

    public static final C2571e billing(AbstractC11424e abstractC11424e, InterfaceC13033e interfaceC13033e) {
        long longValue;
        Long tapsense;
        Object obj = abstractC11424e.f22964e;
        InterfaceC8376e interfaceC8376e = (InterfaceC8376e) obj;
        String mo459e = interfaceC8376e.license().ad().mo459e("Content-Type");
        if (mo459e == null) {
            throw new C4854e(null);
        }
        String mo459e2 = interfaceC8376e.license().ad().mo459e("Content-Length");
        Long valueOf = mo459e2 != null ? Long.valueOf(Long.parseLong(mo459e2)) : null;
        try {
            InterfaceC8850e mo394const = abstractC11424e.advert().mo394const(AbstractC6731e.vip);
            C8208e c8208e = AbstractC4133e.ad;
            Long l = (Long) ((InterfaceC8376e) obj).getAttributes().purchase(AbstractC4133e.ad);
            if (l != null) {
                longValue = l.longValue();
            } else {
                String property = System.getProperty("io.ktor.server.request.formFieldLimit");
                longValue = (property == null || (tapsense = AbstractC6507e.tapsense(property)) == null) ? 52428800L : tapsense.longValue();
            }
            return new C2571e(mo394const, interfaceC13033e, mo459e, valueOf, longValue);
        } catch (C0230e unused) {
            C1622e c1622e = C1622e.f4539e;
            throw new C4854e(AbstractC6227e.metrica(mo459e));
        }
    }

    public static int license(double d) {
        double d2 = d / 100.0d;
        return (int) AbstractC3062e.ad(Math.rint((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0.0d, 255.0d);
    }

    public static boolean metrica(InterfaceC2283e interfaceC2283e) {
        C1292e c1292e = new C1292e(8);
        int i = C9436e.vip(interfaceC2283e, c1292e).f18776e;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC2283e.ad(0, 4, c1292e.ad);
        c1292e.m571try(0);
        int smaato = c1292e.smaato();
        if (smaato == 1463899717) {
            return true;
        }
        AbstractC2803e.purchase("WavHeaderReader", "Unsupported form type: " + smaato);
        return false;
    }

    public static double purchase(int i) {
        double d = i / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static C9436e startapp(int i, InterfaceC2283e interfaceC2283e, C1292e c1292e) {
        C9436e vip2 = C9436e.vip(interfaceC2283e, c1292e);
        while (true) {
            int i2 = vip2.f18776e;
            if (i2 == i) {
                return vip2;
            }
            AbstractC10257e.pro("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = vip2.f18775e;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C15125e.metrica("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC2283e.amazon((int) j2);
            vip2 = C9436e.vip(interfaceC2283e, c1292e);
        }
    }

    public static final void vip(C17561e c17561e, InterfaceC7484e interfaceC7484e, Function0 function0, InterfaceC0542e interfaceC0542e, Function1 function1, Function0 function02, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(449245700);
        int i2 = i | (c13770e2.purchase(interfaceC7484e) ? 32 : 16) | (c13770e2.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.yandex(interfaceC0542e) ? 2048 : 1024) | (c13770e2.yandex(function1) ? 16384 : 8192) | (c13770e2.yandex(function02) ? 131072 : 65536);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 74897) != 74896)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e2, 0, 1);
            int i3 = i2 >> 9;
            InterfaceC3314e license2 = AbstractC4628e.license(interfaceC0542e, c13770e2, i3 & 14);
            boolean z = interfaceC7484e.equals(C13912e.ad) || interfaceC7484e.equals(C1406e.ad);
            float f = 16;
            C13964e billing = AbstractC16497e.billing(f);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica2 = AbstractC5679e.metrica(AbstractC18007e.metrica(c0115e, 1.0f), new C6253e(f));
            C4789e ad2 = AbstractC14801e.ad(billing, C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.spark_payment_window_target_selector_title);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e2, 48, 0, 130040);
            AbstractC11257e.metrica((String) license2.getValue(), function1, AbstractC18007e.metrica(c0115e, 1.0f), false, null, AbstractC2270e.vip, null, z ? AbstractC2270e.ad : null, AbstractC2270e.metrica, z, null, null, null, true, 0, 0, null, null, c13770e, (i3 & 112) | 1573248, 12582918, 8247736);
            c13770e2 = c13770e;
            boolean license3 = c13770e2.license(startapp);
            Object m3681throw = c13770e2.m3681throw();
            if (license3 || m3681throw == C2987e.ad) {
                m3681throw = new C17028e(startapp, 29);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC7572e.vip(interfaceC7484e, null, (Function1) m3681throw, null, null, null, AbstractC2270e.license, c13770e2, ((i2 >> 3) & 14) | 1572864, 58);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e2, 0);
            long j2 = c13770e2.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, c0115e);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            AbstractC1513e.license(function0, null, false, null, null, null, AbstractC2270e.appmetrica, c13770e2, ((i2 >> 6) & 14) | 805306368, 510);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e2, new C5228e(1.0f, true));
            AbstractC1513e.ad(function02, null, interfaceC7484e instanceof C17293e, null, null, null, null, null, AbstractC2270e.purchase, c13770e2, ((i2 >> 15) & 14) | 805306368, 506);
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C2779e(c17561e, interfaceC7484e, function0, interfaceC0542e, function1, function02, i, 5);
        }
    }

    public static final String yandex(InterfaceC17430e interfaceC17430e, Charset charset) {
        InterfaceC17430e interfaceC17430e2;
        Function0 c10673e;
        if (interfaceC17430e instanceof C3067e) {
            interfaceC17430e2 = interfaceC17430e;
            c10673e = new C17642e(0, 2, C3067e.class, interfaceC17430e2, "closed", "getClosed()Z");
        } else {
            interfaceC17430e2 = interfaceC17430e;
            if (!(interfaceC17430e2 instanceof C12402e)) {
                throw new C14803e(10);
            }
            c10673e = new C10673e(19);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new C4923e(c10673e, interfaceC17430e2), charset);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
            stringWriter.write(cArr, 0, read);
        }
        return stringWriter.toString();
    }
}
