package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7354e {
    public static final C2892e ad = new C2892e(1892533350, false, new C11832e(10));
    public static final C2892e vip = new C2892e(1456681893, false, new C11832e(11));
    public static final C2892e metrica = new C2892e(308808284, false, new C11832e(12));
    public static final C2892e license = new C2892e(-2083261985, false, new C11832e(13));
    public static final C2892e appmetrica = new C2892e(2007927123, false, new C11832e(14));
    public static final C2892e purchase = new C2892e(-1416886733, false, new C15480e(4));
    public static final C2892e billing = new C2892e(-353924903, false, new C15480e(5));
    public static final C2892e yandex = new C2892e(816797503, false, new C11832e(15));

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:111|112))|(5:106|107|108|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|(1:79)(5:70|(4:72|(1:74)|76|77)|78|76|77))|65|(1:67)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00ee, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ae, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
    
        if (defpackage.AbstractC7890e.billing(r2.vip(r0), r2.vip(defpackage.C18384e.class)) != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c A[Catch: NoSuchFieldException -> 0x017b, TryCatch #1 {NoSuchFieldException -> 0x017b, blocks: (B:81:0x0142, B:83:0x014c, B:92:0x0168, B:94:0x016e, B:95:0x0174, B:97:0x0178, B:88:0x0160), top: B:80:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0178 A[Catch: NoSuchFieldException -> 0x017b, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x017b, blocks: (B:81:0x0142, B:83:0x014c, B:92:0x0168, B:94:0x016e, B:95:0x0174, B:97:0x0178, B:88:0x0160), top: B:80:0x0142 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.InterfaceC5372e ad(defpackage.InterfaceC7227e r16, defpackage.InterfaceC5372e... r17) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7354e.ad(eؚ٘ٚ, eؘؒٙ[]):eؘؒٙ");
    }

    public static byte[] appmetrica(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static final Object billing(Context context, InterfaceC8418e interfaceC8418e, C10838e c10838e, Function2 function2, AbstractC10731e abstractC10731e) {
        if (c10838e instanceof C10838e) {
            return C16669e.ad.license(context, interfaceC8418e, AbstractC14114e.vip(c10838e.ad), function2, abstractC10731e);
        }
        throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
    }

    public static boolean license(byte b) {
        return b > -65;
    }

    public static final InterfaceC5372e metrica(Object obj, InterfaceC5372e... interfaceC5372eArr) {
        Class[] clsArr;
        try {
            if (interfaceC5372eArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC5372eArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC5372e.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC5372eArr, interfaceC5372eArr.length));
            if (invoke instanceof InterfaceC5372e) {
                return (InterfaceC5372e) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static byte[] purchase(int i, BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
        return bArr;
    }

    public static BigInteger vip(byte[] bArr) {
        return new BigInteger(1, bArr);
    }
}
