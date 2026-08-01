package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.channels.ClosedChannelException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4533e {
    public static final Object[] ad = new Object[0];
    public static final String[] vip = {"ru", "ua", "en", "pt", "kz"};
    public static String metrica = BuildConfig.FLAVOR;
    public static String license = "en";

    public static final void ad(String str, boolean z, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1729801358);
        int i2 = i | (c13770e2.purchase(str) ? 4 : 2) | (c13770e2.billing(z) ? 32 : 16) | (c13770e2.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.yandex(function02) ? 2048 : 1024);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            float f = 16;
            C13964e billing = AbstractC16497e.billing(f);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica2 = AbstractC5679e.metrica(AbstractC18007e.metrica(c0115e, 1.0f), new C6253e(f));
            C4789e ad2 = AbstractC14801e.ad(billing, C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
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
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.spark_payment_invoked_title);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
            AbstractC14489e.vip(AbstractC5297e.license(z ? R.string.spark_payment_invoked_text_automatic : R.string.spark_payment_invoked_text_manual, new Object[]{str}, c13770e), AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 48, 0, 130040);
            AbstractC0865e.vip(function0, null, false, null, null, null, null, AbstractC17202e.license, c13770e, ((i2 >> 6) & 14) | 100663296, 254);
            InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(f), C5438e.f11685e, c13770e, 6);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, metrica3);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C16005e c16005e = new C16005e(f, f, f, f);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC1513e.ad(function02, new C5228e(1.0f, true), false, ((C7019e) c13770e.adcel(c15492e)).metrica.metrica, null, null, null, c16005e, AbstractC17202e.appmetrica, c13770e, ((i2 >> 9) & 14) | 817889280, 372);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(str, z, function0, function02, i, 9);
        }
    }

    public static final Object[] adcel(Collection collection) {
        int size = collection.size();
        Object[] objArr = ad;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:14)(2:11|12))(2:15|(2:41|42)(5:19|(8:21|22|23|24|(2:26|27)|28|29|30)(4:34|35|36|37)|43|29|30))))|44|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r6.mo325static(r8, r0, r2) == r3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object advert(defpackage.InterfaceC6141e r6, defpackage.C2394e r7, java.lang.String r8, defpackage.AbstractC10731e r9) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<eۣؔؗ> r1 = defpackage.C2394e.class
            boolean r2 = r9 instanceof defpackage.C10303e
            if (r2 == 0) goto L17
            r2 = r9
            eَٖۣ r2 = (defpackage.C10303e) r2
            int r3 = r2.f20350e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f20350e = r3
            goto L1c
        L17:
            eَٖۣ r2 = new eَٖۣ
            r2.<init>(r9)
        L1c:
            java.lang.Object r9 = r2.f20351e
            int r3 = r2.f20350e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 == r5) goto L28
            if (r3 != r4) goto L2c
        L28:
            defpackage.AbstractC2003e.purchase(r9)     // Catch: defpackage.C9948e -> L88
            goto L88
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.AbstractC2003e.purchase(r9)
            eًٌٍ r9 = r6.loadAd()
            boolean r9 = r9.admob()
            if (r9 != 0) goto L8b
            eًٌٍ r9 = r6.loadAd()
            boolean r9 = r9.mopub()
            if (r9 == 0) goto L4c
            goto L8b
        L4c:
            r9 = 0
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r8 != 0) goto L69
            eؙّؔ r8 = defpackage.AbstractC3820e.ad     // Catch: defpackage.C9948e -> L88
            eؚ٘ٚ r8 = r8.vip(r1)     // Catch: defpackage.C9948e -> L88
            eٓٔۖ r9 = defpackage.AbstractC3820e.ad(r1)     // Catch: java.lang.Throwable -> L5b
        L5b:
            eِ۟ۥ r0 = new eِ۟ۥ     // Catch: defpackage.C9948e -> L88
            r0.<init>(r8, r9)     // Catch: defpackage.C9948e -> L88
            r2.f20350e = r5     // Catch: defpackage.C9948e -> L88
            java.lang.Object r6 = r6.mo325static(r7, r0, r2)     // Catch: defpackage.C9948e -> L88
            if (r6 != r3) goto L88
            goto L87
        L69:
            eًٌٍ r1 = r6.loadAd()     // Catch: defpackage.C9948e -> L88
            r1.billing(r7)     // Catch: defpackage.C9948e -> L88
            eؙّؔ r7 = defpackage.AbstractC3820e.ad     // Catch: defpackage.C9948e -> L88
            eؚ٘ٚ r7 = r7.vip(r0)     // Catch: defpackage.C9948e -> L88
            eٓٔۖ r9 = defpackage.AbstractC3820e.ad(r0)     // Catch: java.lang.Throwable -> L7a
        L7a:
            eِ۟ۥ r0 = new eِ۟ۥ     // Catch: defpackage.C9948e -> L88
            r0.<init>(r7, r9)     // Catch: defpackage.C9948e -> L88
            r2.f20350e = r4     // Catch: defpackage.C9948e -> L88
            java.lang.Object r6 = r6.mo325static(r8, r0, r2)     // Catch: defpackage.C9948e -> L88
            if (r6 != r3) goto L88
        L87:
            return r3
        L88:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L8b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4533e.advert(eؙؓؓ, eۣؔؗ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2714e appmetrica(int i, boolean z) {
        int metrica2 = metrica();
        C13789e c13789e = AbstractC5616e.ad;
        C12870e yandex = AbstractC12696e.yandex(300, 2, c13789e);
        C2288e c2288e = new C2288e(i, 1, z);
        C11139e c11139e = AbstractC15869e.ad;
        C18351e ad2 = new C18351e(new C5761e((C15421e) null, new C1223e(new C16860e(1, c2288e), yandex), (C4980e) null, (C12395e) null, (LinkedHashMap) null, 125)).ad(AbstractC15869e.license(new C12870e(300 - metrica2, metrica2, AbstractC5616e.vip), 2));
        C15421e c15421e = null;
        C12395e c12395e = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C2128e ad3 = new C2128e(new C5761e(c15421e, new C1223e(new C16860e(3, new C2288e(i, 0, z)), AbstractC12696e.yandex(300, 2, c13789e)), (C4980e) objArr, c12395e, (LinkedHashMap) objArr2, 125)).ad(AbstractC15869e.appmetrica(new C12870e(metrica2, 0, AbstractC5616e.metrica), 2));
        int i2 = AbstractC7572e.vip;
        return new C2714e(ad2, ad3);
    }

    public static final C18351e billing(int i, boolean z) {
        int metrica2 = metrica();
        C12870e yandex = AbstractC12696e.yandex(300, 2, AbstractC5616e.ad);
        C2288e c2288e = new C2288e(i, 2, z);
        C11139e c11139e = AbstractC15869e.ad;
        return new C18351e(new C5761e((C15421e) null, new C1223e(new C16860e(2, c2288e), yandex), (C4980e) null, (C12395e) null, (LinkedHashMap) null, 125)).ad(AbstractC15869e.license(new C12870e(300 - metrica2, metrica2, AbstractC5616e.vip), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (advert(r5, r7, r6, r0) != r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r7 == r4) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.InterfaceC6141e r5, java.lang.Throwable r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C7502e
            if (r0 == 0) goto L13
            r0 = r7
            eؚ۠ٞ r0 = (defpackage.C7502e) r0
            int r1 = r0.f15290e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15290e = r1
            goto L18
        L13:
            eؚ۠ٞ r0 = new eؚ۠ٞ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15291e
            int r1 = r0.f15290e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.AbstractC2003e.purchase(r7)
            goto L95
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            java.lang.Throwable r6 = r0.f15288e
            eؙؓؓ r5 = r0.f15289e
            defpackage.AbstractC2003e.purchase(r7)
            goto L64
        L3b:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f15289e = r5
            r0.f15288e = r6
            r0.f15290e = r3
            eًؗٝ r7 = r5.mo324extends()
            defpackage.AbstractC11912e.metrica(r7)
            eٌۧۨ r7 = new eٌۧۨ
            r1 = 5
            r7.<init>(r5, r6, r0, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r7 = r7.loadAd(r1)
            if (r7 != r4) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L5c:
            if (r7 != r4) goto L5f
            goto L61
        L5f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L61:
            if (r7 != r4) goto L64
            goto L94
        L64:
            boolean r7 = r6 instanceof defpackage.C9230e
            r1 = 0
            if (r7 == 0) goto L6c
            eۣؔؗ r7 = defpackage.C2394e.f6113e
            goto L80
        L6c:
            boolean r7 = r6 instanceof defpackage.C4854e
            if (r7 == 0) goto L73
            eۣؔؗ r7 = defpackage.C2394e.f6120e
            goto L80
        L73:
            boolean r7 = r6 instanceof java.util.concurrent.TimeoutException
            if (r7 != 0) goto L7e
            boolean r7 = r6 instanceof defpackage.C3063e
            if (r7 == 0) goto L7c
            goto L7e
        L7c:
            r7 = r1
            goto L80
        L7e:
            eۣؔؗ r7 = defpackage.C2394e.f6118e
        L80:
            if (r7 != 0) goto L84
            eۣؔؗ r7 = defpackage.C2394e.f6114e
        L84:
            java.lang.String r6 = r6.getMessage()
            r0.f15289e = r1
            r0.f15288e = r1
            r0.f15290e = r2
            java.lang.Object r5 = advert(r5, r7, r6, r0)
            if (r5 != r4) goto L95
        L94:
            return r4
        L95:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4533e.license(eؙؓؓ, java.lang.Throwable, eُؑ۠):java.lang.Object");
    }

    public static final int metrica() {
        return (int) (300 * 0.35f);
    }

    public static final Object[] mopub(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static C2714e purchase(int i, boolean z) {
        C18351e billing = billing(i, z);
        C2128e yandex = yandex(i, z);
        int i2 = AbstractC7572e.vip;
        return new C2714e(billing, yandex);
    }

    public static final int startapp(float f, C13770e c13770e, int i, int i2) {
        c13770e.m3672private(-1131358425);
        boolean z = true;
        if ((i2 & 1) != 0) {
            f = AbstractC17734e.ad;
        }
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        c13770e.m3672private(624596967);
        boolean purchase = c13770e.purchase(interfaceC14388e);
        if ((((i & 14) ^ 6) <= 4 || !c13770e.metrica(f)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = purchase | z;
        Object m3681throw = c13770e.m3681throw();
        if (z2 || m3681throw == C2987e.ad) {
            m3681throw = Integer.valueOf(interfaceC14388e.mo493e(f));
            c13770e.m3682throws(m3681throw);
        }
        int intValue = ((Number) m3681throw).intValue();
        c13770e.Signature(false);
        c13770e.Signature(false);
        return intValue;
    }

    public static final void vip(C11467e c11467e, InterfaceC6141e interfaceC6141e, Throwable th) {
        String str;
        try {
            try {
                Object smaato = interfaceC6141e.loadAd().smaato();
                if (smaato == null) {
                    smaato = "Unhandled";
                }
                try {
                    InterfaceC2861e license2 = interfaceC6141e.license();
                    str = ((C3434e) ((C17790e) AbstractC10337e.ad(license2)).f34883e).ad + " - " + AbstractC7535e.admob(license2);
                } catch (Throwable th2) {
                    str = "(request error: " + th2 + ')';
                }
                String str2 = smaato + ": " + str + ". Exception " + AbstractC3820e.ad.vip(th.getClass()) + ": " + th.getMessage();
                if (!(th instanceof CancellationException) && !(th instanceof ClosedChannelException) && !(th instanceof C0667e) && !(th instanceof IOException) && !(th instanceof C9230e) && !(th instanceof C4854e)) {
                    ((InterfaceC4911e) c11467e.f23070e).license(smaato + ": " + str, th);
                    return;
                }
                ((InterfaceC4911e) c11467e.f23070e).adcel(str2, th);
            } catch (OutOfMemoryError unused) {
                InterfaceC4911e interfaceC4911e = (InterfaceC4911e) c11467e.f23070e;
                String message = th.getMessage();
                if (message == null) {
                    message = "Exception of type " + AbstractC3820e.ad.vip(th.getClass());
                }
                interfaceC4911e.license(message, th);
            }
        } catch (OutOfMemoryError unused2) {
            System.err.print((Object) "OutOfMemoryError: ");
            System.err.print((Object) th.getMessage());
            System.err.print((Object) "\n");
        }
    }

    public static final C2128e yandex(int i, boolean z) {
        C12870e yandex = AbstractC12696e.yandex(300, 2, AbstractC5616e.ad);
        C17097e c17097e = new C17097e(16, new C2288e(i, 3, z));
        C11139e c11139e = AbstractC15869e.ad;
        return new C2128e(new C5761e((C15421e) null, new C1223e(c17097e, yandex), (C4980e) null, (C12395e) null, (LinkedHashMap) null, 125)).ad(AbstractC15869e.appmetrica(new C12870e(metrica(), 0, AbstractC5616e.metrica), 2));
    }
}
