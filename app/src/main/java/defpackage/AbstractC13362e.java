package defpackage;

import android.content.res.Resources;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13362e {
    public static final C2892e ad = new C2892e(-489887388, false, new C14498e(2));
    public static final C2892e vip = new C2892e(1629163587, false, new C14498e(3));
    public static final C2892e metrica = new C2892e(-546752734, false, new C14498e(4));
    public static final C2892e license = new C2892e(1572298241, false, new C14498e(5));

    public static final boolean ad(C6071e c6071e) {
        C0500e mopub = c6071e.mopub();
        return !mopub.f2578e.metrica(AbstractC9058e.adcel);
    }

    public static final long adcel(long j, long j2, float f) {
        C4616e[] c4616eArr = C12973e.vip;
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (1095216660480L & j2) == 0) {
            AbstractC15805e.ad("Cannot perform operation for Unspecified type.");
        }
        if (!C4616e.ad(C12973e.vip(j), C12973e.vip(j2))) {
            AbstractC15805e.ad("Cannot perform operation for " + ((Object) C4616e.vip(C12973e.vip(j))) + " and " + ((Object) C4616e.vip(C12973e.vip(j2))));
        }
        return mopub(AbstractC15842e.startapp(C12973e.metrica(j), C12973e.metrica(j2), f), j3);
    }

    public static String advert(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static final boolean appmetrica(C6071e c6071e) {
        Object billing = c6071e.license.f2578e.billing(AbstractC9058e.f18143throw);
        if (billing == null) {
            billing = null;
        }
        EnumC9470e enumC9470e = (EnumC9470e) billing;
        C0583e c0583e = c6071e.license.f2578e;
        Object billing2 = c0583e.billing(AbstractC9058e.applovin);
        if (billing2 == null) {
            billing2 = null;
        }
        C11796e c11796e = (C11796e) billing2;
        boolean z = enumC9470e != null;
        Object billing3 = c0583e.billing(AbstractC9058e.f18136extends);
        if (((Boolean) (billing3 != null ? billing3 : null)) == null || (c11796e != null && c11796e.ad == 4)) {
            return z;
        }
        return true;
    }

    public static final C10566e billing(C6071e c6071e) {
        C0500e c0500e = c6071e.license;
        C16591e c16591e = AbstractC9058e.ad;
        C10566e c10566e = (C10566e) AbstractC0259e.appmetrica(c0500e, AbstractC9058e.f18139interface);
        List list = (List) AbstractC0259e.appmetrica(c6071e.license, AbstractC9058e.subs);
        return c10566e == null ? list != null ? (C10566e) AbstractC13480e.m3604this(list) : null : c10566e;
    }

    public static void license(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC16647e.ad;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC16224e.ad;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final boolean metrica(C6071e c6071e, Resources resources) {
        Object billing = c6071e.license.f2578e.billing(AbstractC9058e.ad);
        if (billing == null) {
            billing = null;
        }
        List list = (List) billing;
        return !AbstractC0421e.billing(c6071e) && (c6071e.license.f2575e || (c6071e.admob() && ((list != null ? (String) AbstractC13480e.m3604this(list) : null) != null || billing(c6071e) != null || purchase(c6071e, resources) != null || appmetrica(c6071e))));
    }

    public static final long mopub(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        C4616e[] c4616eArr = C12973e.vip;
        return floatToRawIntBits;
    }

    public static final String purchase(C6071e c6071e, Resources resources) {
        int i;
        C0500e c0500e = c6071e.license;
        C0500e c0500e2 = c6071e.license;
        Object billing = c0500e.f2578e.billing(AbstractC9058e.vip);
        String str = null;
        if (billing == null) {
            billing = null;
        }
        C0583e c0583e = c0500e2.f2578e;
        Object billing2 = c0583e.billing(AbstractC9058e.f18143throw);
        if (billing2 == null) {
            billing2 = null;
        }
        EnumC9470e enumC9470e = (EnumC9470e) billing2;
        Object billing3 = c0583e.billing(AbstractC9058e.applovin);
        if (billing3 == null) {
            billing3 = null;
        }
        C11796e c11796e = (C11796e) billing3;
        if (enumC9470e != null) {
            int ordinal = enumC9470e.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C14803e(10);
                    }
                    if (billing == null) {
                        billing = resources.getString(R.string.indeterminate);
                    }
                } else if (c11796e != null && c11796e.ad == 2 && billing == null) {
                    billing = resources.getString(R.string.state_off);
                }
            } else if (c11796e != null && c11796e.ad == 2 && billing == null) {
                billing = resources.getString(R.string.state_on);
            }
        }
        Object billing4 = c0583e.billing(AbstractC9058e.f18136extends);
        if (billing4 == null) {
            billing4 = null;
        }
        Boolean bool = (Boolean) billing4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((c11796e == null || c11796e.ad != 4) && billing == null) {
                billing = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object billing5 = c0583e.billing(AbstractC9058e.metrica);
        if (billing5 == null) {
            billing5 = null;
        }
        C0196e c0196e = (C0196e) billing5;
        if (c0196e != null) {
            if (c0196e != C0196e.license) {
                if (billing == null) {
                    C3721e c3721e = c0196e.vip;
                    float f = c3721e.vip;
                    float f2 = c3721e.ad;
                    float f3 = f - f2 == 0.0f ? 0.0f : (c0196e.ad - f2) / (c3721e.vip - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        i = 0;
                    } else {
                        i = 100;
                        if (f3 != 1.0f) {
                            i = AbstractC3062e.metrica(Math.round(f3 * 100), 1, 99);
                        }
                    }
                    billing = resources.getString(R.string.template_percent, Integer.valueOf(i));
                }
            } else if (billing == null) {
                billing = resources.getString(R.string.in_progress);
            }
        }
        C16591e c16591e = AbstractC9058e.f18139interface;
        if (c0583e.metrica(c16591e)) {
            C0583e c0583e2 = new C6071e(c6071e.ad, true, c6071e.metrica, c0500e2).mopub().f2578e;
            Object billing6 = c0583e2.billing(AbstractC9058e.ad);
            if (billing6 == null) {
                billing6 = null;
            }
            Collection collection = (Collection) billing6;
            if (collection == null || collection.isEmpty()) {
                Object billing7 = c0583e2.billing(AbstractC9058e.subs);
                if (billing7 == null) {
                    billing7 = null;
                }
                Collection collection2 = (Collection) billing7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object billing8 = c0583e2.billing(c16591e);
                    if (billing8 == null) {
                        billing8 = null;
                    }
                    CharSequence charSequence = (CharSequence) billing8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            billing = str;
        }
        return (String) billing;
    }

    public static int smaato(String str) {
        Integer num;
        try {
            Map map = ResourceProvider.ad;
            num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final long startapp(int i) {
        return mopub(i, 4294967296L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (defpackage.AbstractC7890e.billing(r0, java.lang.Boolean.TRUE) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean vip(defpackage.C6071e r4) {
        /*
            eؑۗؕ r0 = r4.license
            eٖۣ r1 = defpackage.AbstractC9058e.f18139interface
            eؑ۟ؖ r0 = r0.f2578e
            boolean r0 = r0.metrica(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            eؑۗؕ r0 = r4.license
            eٖۣ r3 = defpackage.AbstractC9058e.advert
            eؑ۟ؖ r0 = r0.f2578e
            java.lang.Object r0 = r0.billing(r3)
            if (r0 != 0) goto L1b
            r0 = r1
        L1b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r3)
            if (r0 != 0) goto L24
            goto L66
        L24:
            eِٓؔ r4 = r4.metrica
            eِٓؔ r4 = r4.tapsense()
        L2a:
            if (r4 == 0) goto L46
            eؑۗؕ r0 = r4.inmobi()
            if (r0 == 0) goto L41
            boolean r3 = r0.f2575e
            if (r3 != r2) goto L41
            eٖۣ r3 = defpackage.AbstractC9058e.f18139interface
            eؑ۟ؖ r0 = r0.f2578e
            boolean r0 = r0.metrica(r3)
            if (r0 == 0) goto L41
            goto L47
        L41:
            eِٓؔ r4 = r4.tapsense()
            goto L2a
        L46:
            r4 = r1
        L47:
            r0 = 0
            if (r4 == 0) goto L67
            eؑۗؕ r4 = r4.inmobi()
            if (r4 == 0) goto L63
            eٖۣ r3 = defpackage.AbstractC9058e.advert
            eؑ۟ؖ r4 = r4.f2578e
            java.lang.Object r4 = r4.billing(r3)
            if (r4 != 0) goto L5b
            goto L5c
        L5b:
            r1 = r4
        L5c:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = defpackage.AbstractC7890e.billing(r1, r4)
            goto L64
        L63:
            r4 = r0
        L64:
            if (r4 != 0) goto L67
        L66:
            return r2
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13362e.vip(eٌؘۧ):boolean");
    }

    public static final long yandex(double d) {
        return mopub((float) d, 4294967296L);
    }
}
