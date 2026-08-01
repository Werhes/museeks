package defpackage;

import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0903e {
    public static int billing = -1;
    public static C5687e yandex;
    public static final C8336e ad = new Object();
    public static final C6488e vip = new Object();
    public static final int[] metrica = {13, 41, 121, 337, 897, 2305};
    public static final byte[] license = new byte[0];
    public static final int[] appmetrica = new int[0];
    public static final AbstractC9932e[] purchase = new AbstractC9932e[0];

    public static final void ad(C2357e c2357e, List list, Function1 function1, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1007379715);
        int i2 = i | (c13770e2.yandex(list) ? 32 : 16) | (c13770e2.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 145) != 144)) {
            C13964e billing2 = AbstractC16497e.billing(16);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
            C4789e ad2 = AbstractC14801e.ad(billing2, C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
            String appmetrica2 = AbstractC5297e.appmetrica(c13770e2, R.string.spark_payment_window_method);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica2, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
            c13770e2 = c13770e;
            AbstractC0865e.ad(null, null, null, null, null, AbstractC16653e.license(-1039797739, new C11828e(list, function1, 18), c13770e2), c13770e2, 196608, 31);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C18522e(i, 6, c2357e, list, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17268e adcel() {
        /*
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            java.lang.Class<eؚؒؒ> r1 = defpackage.AbstractC0903e.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<eٗۛۤ> r2 = defpackage.C17268e.class
            boolean r3 = r2.equals(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L13
            goto L2f
        L13:
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r1)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            if (r0 != 0) goto L22
            throw r5
        L22:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.ReflectiveOperationException -> L28
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L28
            throw r0     // Catch: java.lang.ReflectiveOperationException -> L28
        L28:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L2f
            r1.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            throw r1     // Catch: java.lang.ClassNotFoundException -> L2f
        L2f:
            r1 = 0
            eؚؒؒ[] r0 = new defpackage.AbstractC0903e[r1]     // Catch: java.lang.Throwable -> La6
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L77
            int r0 = r6.size()
            if (r0 != r4) goto L52
            java.lang.Object r0 = r6.get(r1)
            eٗۛۤ r0 = (defpackage.C17268e) r0
            return r0
        L52:
            int r0 = r6.size()
            if (r0 != 0) goto L59
            return r5
        L59:
            java.lang.String r0 = "combine"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            r3[r1] = r7     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.ReflectiveOperationException -> L70
            r2[r1] = r6     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object r0 = r0.invoke(r5, r2)     // Catch: java.lang.ReflectiveOperationException -> L70
            eٗۛۤ r0 = (defpackage.C17268e) r0     // Catch: java.lang.ReflectiveOperationException -> L70
            return r0
        L70:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L77:
            java.lang.Object r0 = r3.next()     // Catch: java.util.ServiceConfigurationError -> L86
            if (r0 != 0) goto L7e
            throw r5
        L7e:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.ServiceConfigurationError -> L86
            r0.<init>()     // Catch: java.util.ServiceConfigurationError -> L86
            throw r0     // Catch: java.util.ServiceConfigurationError -> L86
        L84:
            r12 = r0
            goto L88
        L86:
            r0 = move-exception
            goto L84
        L88:
            java.lang.Class<eٌٓۨ> r0 = defpackage.AbstractC13874e.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r7 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r10 = "load"
            java.lang.String r9 = "Unable to load "
            java.lang.String r11 = r9.concat(r0)
            java.lang.String r9 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            r7.logp(r8, r9, r10, r11, r12)
            goto L3f
        La6:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0903e.adcel():eٗۛۤ");
    }

    public static int appmetrica(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static C0984e billing(C13770e c13770e) {
        return ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip;
    }

    public static C9553e license(C13770e c13770e) {
        return ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
    }

    public static byte[] metrica(int i, BigInteger bigInteger) {
        if (i == 2) {
            if (bigInteger.signum() != 0) {
                BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
                int bitLength = add.bitLength();
                int i2 = bitLength - 1;
                byte[] bArr = new byte[i2];
                BigInteger xor = add.xor(bigInteger);
                int i3 = 1;
                while (i3 < i2) {
                    if (xor.testBit(i3)) {
                        bArr[i3 - 1] = (byte) (bigInteger.testBit(i3) ? -1 : 1);
                        i3++;
                    }
                    i3++;
                }
                bArr[bitLength - 2] = 1;
                return bArr;
            }
        } else {
            if (i < 2 || i > 8) {
                throw new IllegalArgumentException("'width' must be in the range [2, 8]");
            }
            if (bigInteger.signum() != 0) {
                int bitLength2 = bigInteger.bitLength() + 1;
                byte[] bArr2 = new byte[bitLength2];
                int i4 = 1 << i;
                int i5 = i4 - 1;
                int i6 = i4 >>> 1;
                int i7 = 0;
                int i8 = 0;
                boolean z = false;
                while (i7 <= bigInteger.bitLength()) {
                    if (bigInteger.testBit(i7) == z) {
                        i7++;
                    } else {
                        bigInteger = bigInteger.shiftRight(i7);
                        int intValue = bigInteger.intValue() & i5;
                        if (z) {
                            intValue++;
                        }
                        z = (intValue & i6) != 0;
                        if (z) {
                            intValue -= i4;
                        }
                        if (i8 > 0) {
                            i7--;
                        }
                        int i9 = i8 + i7;
                        bArr2[i9] = (byte) intValue;
                        i8 = i9 + 1;
                        i7 = i;
                    }
                }
                if (bitLength2 <= i8) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i8];
                System.arraycopy(bArr2, 0, bArr3, 0, i8);
                return bArr3;
            }
        }
        return license;
    }

    public static C17500e purchase(C13770e c13770e) {
        return ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٜۨ, java.lang.Object, eؔۜ] */
    public static C15664e startapp(AbstractC9932e abstractC9932e, int i) {
        AbstractC0362e abstractC0362e = abstractC9932e.ad;
        ?? obj = new Object();
        obj.f14928e = i;
        obj.f14927e = abstractC9932e;
        obj.f14926e = abstractC0362e;
        return (C15664e) abstractC0362e.admob(abstractC9932e, "bc_wnaf", obj);
    }

    public static void vip(AbstractC9932e abstractC9932e) {
        AbstractC0362e abstractC0362e = abstractC9932e.ad;
        if (abstractC0362e == null) {
            return;
        }
        BigInteger bigInteger = abstractC0362e.license;
        abstractC0362e.admob(abstractC9932e, "bc_wnaf", new C5401e(Math.min(16, yandex(bigInteger == null ? abstractC0362e.advert() + 1 : bigInteger.bitLength(), 16, metrica) + 3), 19, (byte) 0));
    }

    public static int yandex(int i, int i2, int[] iArr) {
        int i3 = 0;
        while (i3 < iArr.length && i >= iArr[i3]) {
            i3++;
        }
        return Math.max(2, Math.min(i2, i3 + 2));
    }
}
