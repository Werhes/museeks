package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.car.app.model.Alert;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؖ */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4653e {
    public static final int ad = 1;

    public static /* synthetic */ void Signature(InterfaceC2235e interfaceC2235e, C17985e c17985e, long j, float f, AbstractC4970e abstractC4970e, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            abstractC4970e = C6590e.ad;
        }
        interfaceC2235e.mopub(c17985e, j, f2, abstractC4970e);
    }

    public static int ad(InterfaceC14388e interfaceC14388e, float f) {
        float mo497instanceof = interfaceC14388e.mo497instanceof(f);
        return Float.isInfinite(mo497instanceof) ? Alert.DURATION_SHOW_INDEFINITELY : Math.round(mo497instanceof);
    }

    public static /* synthetic */ void admob(InterfaceC2235e interfaceC2235e, AbstractC4457e abstractC4457e, long j, long j2, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        interfaceC2235e.mo780e(abstractC4457e, j3, (i2 & 4) != 0 ? billing(interfaceC2235e.yandex(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? C6590e.ad : abstractC4970e, (i2 & 32) != 0 ? null : c2815e, (i2 & 64) != 0 ? 3 : i);
    }

    public static String ads(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static void advert(InterfaceC2235e interfaceC2235e, C1362e c1362e, long j, long j2, float f, C2815e c2815e, int i, int i2) {
        interfaceC2235e.mo777e(c1362e, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, c2815e, (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 1 : i);
    }

    public static String applovin(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static long appmetrica(long j, InterfaceC14388e interfaceC14388e) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float mo497instanceof = interfaceC14388e.mo497instanceof(C16109e.vip(j));
        float mo497instanceof2 = interfaceC14388e.mo497instanceof(C16109e.ad(j));
        return (Float.floatToRawIntBits(mo497instanceof) << 32) | (Float.floatToRawIntBits(mo497instanceof2) & 4294967295L);
    }

    public static long billing(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static AbstractC7861e crashlytics(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return abstractC7861e.applovin().ad(abstractC7861e2).ad(abstractC7861e3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void firebase(Cursor cursor) {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            AbstractC6418e.smaato((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else {
            if (!(cursor instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cursor).release();
        }
    }

    /* renamed from: goto */
    public static /* synthetic */ String m1645goto(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static String inmobi(String str, Ctry ctry) {
        return str + ctry;
    }

    public static String isPro(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String isVip(C13770e c13770e, int i, int i2, C13770e c13770e2, boolean z) {
        c13770e.m3676strictfp(i);
        String appmetrica = AbstractC5297e.appmetrica(c13770e2, i2);
        c13770e.Signature(z);
        return appmetrica;
    }

    public static float license(long j, InterfaceC14388e interfaceC14388e) {
        if (!C4616e.ad(C12973e.vip(j), 4294967296L)) {
            AbstractC15805e.vip("Only Sp can convert to Px");
        }
        return interfaceC14388e.mo497instanceof(interfaceC14388e.firebase(j));
    }

    public static /* synthetic */ void loadAd(InterfaceC2235e interfaceC2235e, C17985e c17985e, AbstractC4457e abstractC4457e, float f, C13121e c13121e, C2815e c2815e, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        AbstractC4970e abstractC4970e = c13121e;
        if ((i2 & 8) != 0) {
            abstractC4970e = C6590e.ad;
        }
        AbstractC4970e abstractC4970e2 = abstractC4970e;
        if ((i2 & 16) != 0) {
            c2815e = null;
        }
        C2815e c2815e2 = c2815e;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        interfaceC2235e.mo784synchronized(c17985e, abstractC4457e, f2, abstractC4970e2, c2815e2, i);
    }

    public static long metrica(long j, InterfaceC14388e interfaceC14388e) {
        if (j != 9205357640488583168L) {
            return AbstractC11160e.ad(interfaceC14388e.mo498new(Float.intBitsToFloat((int) (j >> 32))), interfaceC14388e.mo498new(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static /* synthetic */ void mopub(InterfaceC2235e interfaceC2235e, long j, float f, long j2, AbstractC4970e abstractC4970e, int i) {
        if ((i & 4) != 0) {
            j2 = interfaceC2235e.mo779e();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            abstractC4970e = C6590e.ad;
        }
        interfaceC2235e.mo775abstract(j, f, j3, abstractC4970e);
    }

    public static StringBuilder premium(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void pro(InterfaceC2235e interfaceC2235e, long j, long j2, long j3, long j4, AbstractC4970e abstractC4970e, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        interfaceC2235e.mo783import(j, j5, (i & 4) != 0 ? billing(interfaceC2235e.yandex(), j5) : j3, j4, (i & 16) != 0 ? C6590e.ad : abstractC4970e);
    }

    public static long purchase(InterfaceC14388e interfaceC14388e, float f) {
        float[] fArr = AbstractC9548e.ad;
        if (interfaceC14388e.mo499package() < 1.03f) {
            return AbstractC13362e.mopub(f / interfaceC14388e.mo499package(), 4294967296L);
        }
        InterfaceC8998e ad2 = AbstractC9548e.ad(interfaceC14388e.mo499package());
        return AbstractC13362e.mopub(ad2 != null ? ad2.ad(f) : f / interfaceC14388e.mo499package(), 4294967296L);
    }

    public static /* synthetic */ void remoteconfig(InterfaceC2235e interfaceC2235e, AbstractC4457e abstractC4457e, long j, long j2, long j3, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j;
        interfaceC2235e.mo785throws(abstractC4457e, j4, (i2 & 4) != 0 ? billing(interfaceC2235e.yandex(), j4) : j2, j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? C6590e.ad : abstractC4970e, (i2 & 64) != 0 ? null : c2815e, (i2 & 128) != 0 ? 3 : i);
    }

    public static /* synthetic */ int signatures(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 5;
        }
        throw null;
    }

    public static /* synthetic */ void smaato(InterfaceC2235e interfaceC2235e, C1362e c1362e, long j, float f, C2815e c2815e, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 16) != 0) {
            c2815e = null;
        }
        C2815e c2815e2 = c2815e;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        interfaceC2235e.applovin(c1362e, j2, f2, c2815e2, i);
    }

    public static void startapp(InterfaceC16054e interfaceC16054e) {
        ((C8212e) interfaceC16054e).vip(8, false, true);
    }

    public static Map subs(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static /* synthetic */ void subscription(InterfaceC2235e interfaceC2235e, long j, long j2, long j3, float f, C13121e c13121e, C2815e c2815e, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        interfaceC2235e.mo781e(j, j4, (i2 & 4) != 0 ? billing(interfaceC2235e.yandex(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? C6590e.ad : c13121e, (i2 & 32) != 0 ? null : c2815e, (i2 & 64) != 0 ? 3 : i);
    }

    public static InterfaceC0716e tapsense(Class cls, String str, String str2, int i, C12232e c12232e) {
        return c12232e.yandex(new C12156e(cls, str, str2, i));
    }

    public static float vip(long j, InterfaceC14388e interfaceC14388e) {
        float metrica;
        float mo499package;
        if (!C4616e.ad(C12973e.vip(j), 4294967296L)) {
            AbstractC15805e.vip("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC9548e.ad;
        if (interfaceC14388e.mo499package() >= 1.03f) {
            InterfaceC8998e ad2 = AbstractC9548e.ad(interfaceC14388e.mo499package());
            metrica = C12973e.metrica(j);
            if (ad2 != null) {
                return ad2.vip(metrica);
            }
            mo499package = interfaceC14388e.mo499package();
        } else {
            metrica = C12973e.metrica(j);
            mo499package = interfaceC14388e.mo499package();
        }
        return mo499package * metrica;
    }

    public static final AbstractC11069e yandex(int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return AbstractC11069e.mopub;
        }
        if (m2467class == 1) {
            return AbstractC11069e.advert;
        }
        if (m2467class == 2) {
            return AbstractC11069e.loadAd;
        }
        if (m2467class == 3) {
            return AbstractC11069e.startapp;
        }
        throw new C14803e(10);
    }
}
