package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.car.app.model.Alert;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11538e {
    public static final C2892e ad = new C2892e(1709539737, false, new C12341e(17));
    public static final C2892e vip = new C2892e(339606970, false, new C7478e(0));
    public static final C2892e metrica = new C2892e(-1199960447, false, new C14866e(21));
    public static final C2892e license = new C2892e(-2073412404, false, new C12341e(18));
    public static final C2892e appmetrica = new C2892e(961198057, false, new C12341e(19));
    public static final C2892e purchase = new C2892e(1979857579, false, new C12341e(20));
    public static final C2892e billing = new C2892e(719500744, false, new C12341e(21));
    public static final C2892e yandex = new C2892e(1738160266, false, new C12341e(22));
    public static final C2892e startapp = new C2892e(477803431, false, new C12341e(23));
    public static final C2892e adcel = new C2892e(1496462953, false, new C12341e(24));
    public static final C2892e mopub = new C2892e(236106118, false, new C12341e(25));
    public static final C2892e advert = new C2892e(1254765640, false, new C12341e(26));
    public static final C2892e smaato = new C2892e(-5591195, false, new C12341e(27));
    public static final C2892e amazon = new C2892e(1013068327, false, new C12341e(28));
    public static final C2892e loadAd = new C2892e(-247288508, false, new C12341e(29));
    public static final C2892e Signature = new C2892e(1070043556, false, new C14866e(19));
    public static final C2892e admob = new C2892e(828346243, false, new C14866e(20));

    public static final void ad(final String str, InterfaceC7189e interfaceC7189e, final C14323e c14323e, int i, C13770e c13770e, final int i2, final int i3) {
        int i4;
        c13770e.m3671package(-192911377);
        int i5 = (c13770e.purchase(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (c13770e.purchase(interfaceC7189e) ? 32 : 16);
        }
        int i7 = i4 | (c13770e.purchase(c14323e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= c13770e.license(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3655case();
            if ((i2 & 1) == 0 || c13770e.isPro()) {
                if (i6 != 0) {
                    interfaceC7189e = C17043e.ad;
                }
                if (i8 != 0) {
                    i = Alert.DURATION_SHOW_INDEFINITELY;
                }
            } else {
                c13770e.m3659default();
            }
            c13770e.admob();
            c13770e.m3672private(1849434622);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C6670e.f13769e;
                c13770e.m3682throws(m3681throw);
            }
            c13770e.Signature(false);
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            c13770e.m3672private(-1115894518);
            c13770e.m3672private(1886828752);
            if (!(c13770e.ad instanceof C9626e)) {
                AbstractC5546e.purchase();
                throw null;
            }
            c13770e.m3677super();
            if (c13770e.f27292implements) {
                c13770e.mopub(new C9598e(0, function0));
            } else {
                c13770e.m3684volatile();
            }
            byte b = 0;
            AbstractC2270e.yandex(c13770e, str, new C14151e(b, 16));
            AbstractC2270e.yandex(c13770e, interfaceC7189e, new C14151e(b, 17));
            AbstractC2270e.yandex(c13770e, c14323e, new C14151e(b, 18));
            C14151e c14151e = new C14151e(b, 19);
            if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), Integer.valueOf(i))) {
                c13770e.m3682throws(Integer.valueOf(i));
                c13770e.vip(Integer.valueOf(i), c14151e);
            }
            AbstractC1786e.isPro(c13770e, true, false, false);
        }
        final InterfaceC7189e interfaceC7189e2 = interfaceC7189e;
        final int i9 = i;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؓۘۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC11538e.ad(str, interfaceC7189e2, c14323e, i9, (C13770e) obj, AbstractC5190e.advert(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void adcel(int i, ByteArrayOutputStream byteArrayOutputStream) {
        startapp(byteArrayOutputStream, i, 2);
    }

    public static byte[] appmetrica(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new IllegalStateException(AbstractC1786e.admob(i, "Not enough bytes to read: "));
            }
            i2 += read;
        }
        return bArr;
    }

    public static long billing(InputStream inputStream, int i) {
        byte[] appmetrica2 = appmetrica(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (appmetrica2[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static boolean license(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void metrica(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
        jArr2[i + 7] = jArr[7];
        jArr2[i + 8] = jArr[8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] purchase(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11538e.purchase(java.io.FileInputStream, int, int):byte[]");
    }

    public static void startapp(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] vip(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final C11192e yandex(C4094e c4094e, Function1 function1, C13770e c13770e) {
        Object c17151e;
        Object obj;
        AbstractC14533e.mopub(c4094e, c13770e);
        Object mopub2 = AbstractC14533e.mopub(function1, c13770e);
        Object[] objArr = new Object[0];
        Object m3681throw = c13770e.m3681throw();
        Object obj2 = C2987e.ad;
        if (m3681throw == obj2) {
            m3681throw = new C0743e(2);
            c13770e.m3682throws(m3681throw);
        }
        Object obj3 = (String) AbstractC10510e.license(objArr, (Function0) m3681throw, c13770e);
        InterfaceC5922e interfaceC5922e = (InterfaceC5922e) c13770e.adcel(AbstractC9016e.ad);
        if (interfaceC5922e == null) {
            c13770e.m3676strictfp(1213380307);
            Object obj4 = (Context) c13770e.adcel(AbstractC2676e.vip);
            while (true) {
                if (!(obj4 instanceof ContextWrapper)) {
                    obj4 = null;
                    break;
                }
                if (obj4 instanceof InterfaceC5922e) {
                    break;
                }
                obj4 = ((ContextWrapper) obj4).getBaseContext();
            }
            interfaceC5922e = (InterfaceC5922e) obj4;
        } else {
            c13770e.m3676strictfp(1213379439);
        }
        c13770e.Signature(false);
        if (interfaceC5922e == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        Object appmetrica2 = interfaceC5922e.appmetrica();
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == obj2) {
            m3681throw2 = new Object();
            c13770e.m3682throws(m3681throw2);
        }
        C13199e c13199e = (C13199e) m3681throw2;
        Object m3681throw3 = c13770e.m3681throw();
        if (m3681throw3 == obj2) {
            m3681throw3 = new C11192e(c13199e);
            c13770e.m3682throws(m3681throw3);
        }
        C11192e c11192e = (C11192e) m3681throw3;
        boolean yandex2 = c13770e.yandex(c13199e) | c13770e.yandex(appmetrica2) | c13770e.purchase(obj3) | c13770e.yandex(c4094e) | c13770e.purchase(mopub2);
        Object m3681throw4 = c13770e.m3681throw();
        if (yandex2 || m3681throw4 == obj2) {
            obj = c4094e;
            c17151e = new C17151e(c13199e, appmetrica2, obj3, obj, mopub2, 0);
            c13770e.m3682throws(c17151e);
        } else {
            c17151e = m3681throw4;
            obj = c4094e;
        }
        Function1 function12 = (Function1) c17151e;
        boolean purchase2 = c13770e.purchase(appmetrica2) | c13770e.purchase(obj3) | c13770e.purchase(obj);
        Object m3681throw5 = c13770e.m3681throw();
        if (purchase2 || m3681throw5 == obj2) {
            m3681throw5 = new C7447e(function12);
            c13770e.m3682throws(m3681throw5);
        }
        return c11192e;
    }
}
