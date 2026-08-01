package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import kotlin.Unit;
import org.mongodb.kbson.BsonObjectId$Companion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9556e implements InterfaceC10630e, InterfaceC11206e, InterfaceC9483e, InterfaceC11306e, InterfaceC7218e, InterfaceC16112e, InterfaceC7898e, InterfaceC0987e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static C9556e f18966e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f18967e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f18968e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f18969e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f18970e;

    public C9556e(int i, C2864e c2864e) {
        this.f18967e = new Object();
        this.f18970e = i;
        this.f18968e = new ArrayDeque(i);
        this.f18969e = c2864e;
    }

    public /* synthetic */ C9556e(int i, Object obj, Object obj2, Object obj3) {
        this.f18968e = obj;
        this.f18967e = obj2;
        this.f18970e = i;
        this.f18969e = obj3;
    }

    public C9556e(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.f18968e = str;
        this.f18970e = i2;
        this.f18967e = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.f18969e = bArr;
    }

    public C9556e(InterfaceC0293e interfaceC0293e) {
        this.f18968e = interfaceC0293e;
        this.f18970e = interfaceC0293e.getDigestSize();
    }

    public C9556e(AbstractC0362e abstractC0362e, int i, C0961e c0961e, AbstractC16982e abstractC16982e) {
        this.f18969e = abstractC0362e;
        this.f18970e = i;
        this.f18968e = c0961e;
        this.f18967e = abstractC16982e;
    }

    public C9556e(C7646e c7646e, C5084e c5084e, C11694e c11694e, int i) {
        this.f18968e = c7646e;
        this.f18967e = c5084e;
        this.f18969e = c11694e;
        this.f18970e = i;
    }

    public C9556e(AbstractC9567e abstractC9567e) {
        this.f18967e = new byte[64];
        this.f18969e = new byte[64];
        this.f18968e = abstractC9567e;
        this.f18970e = abstractC9567e.getDigestSize();
    }

    public C9556e(C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        this.f18968e = c17974e;
        this.f18967e = interfaceC15348e;
        this.f18969e = longPointerWrapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r4.equals("HMACSHA256") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9556e(java.lang.String r4, javax.crypto.spec.SecretKeySpec r5) {
        /*
            r3 = this;
            r3.<init>()
            eؘّۚ r0 = new eؘّۚ
            r0.<init>(r3)
            r3.f18968e = r0
            r1 = 2
            boolean r2 = defpackage.AbstractC1786e.adcel(r1)
            if (r2 == 0) goto L92
            r3.f18967e = r4
            r3.f18969e = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r2 = 16
            if (r5 < r2) goto L8a
            r4.getClass()
            int r5 = r4.hashCode()
            r2 = -1
            switch(r5) {
                case -1823053428: goto L55;
                case 392315023: goto L4a;
                case 392315118: goto L41;
                case 392316170: goto L36;
                case 392317873: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r2
            goto L5f
        L2b:
            java.lang.String r5 = "HMACSHA512"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L5f
        L36:
            java.lang.String r5 = "HMACSHA384"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L3f
            goto L29
        L3f:
            r1 = 3
            goto L5f
        L41:
            java.lang.String r5 = "HMACSHA256"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5f
            goto L29
        L4a:
            java.lang.String r5 = "HMACSHA224"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L53
            goto L29
        L53:
            r1 = 1
            goto L5f
        L55:
            java.lang.String r5 = "HMACSHA1"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5e
            goto L29
        L5e:
            r1 = 0
        L5f:
            switch(r1) {
                case 0: goto L82;
                case 1: goto L7d;
                case 2: goto L78;
                case 3: goto L73;
                case 4: goto L6e;
                default: goto L62;
            }
        L62:
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L6e:
            r4 = 64
            r3.f18970e = r4
            goto L86
        L73:
            r4 = 48
            r3.f18970e = r4
            goto L86
        L78:
            r4 = 32
            r3.f18970e = r4
            goto L86
        L7d:
            r4 = 28
            r3.f18970e = r4
            goto L86
        L82:
            r4 = 20
            r3.f18970e = r4
        L86:
            r0.get()
            return
        L8a:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        L92:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9556e.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public static void ad(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eٌٍٚ] */
    /* renamed from: default, reason: not valid java name */
    public static synchronized C9556e m2611default(Context context) {
        C9556e c9556e;
        synchronized (C9556e.class) {
            try {
                if (f18966e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC14833e("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.f18969e = new ServiceConnectionC15550e(obj);
                    obj.f18970e = 1;
                    obj.f18967e = unconfigurableScheduledExecutorService;
                    obj.f18968e = context.getApplicationContext();
                    f18966e = obj;
                }
                c9556e = f18966e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9556e;
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m2612abstract(char[] cArr, int i) {
        byte[] bArr = (byte[]) this.f18967e;
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            StringBuilder premium = AbstractC4653e.premium("count > string.length: ", i, " > ");
            premium.append(cArr.length);
            throw new IllegalArgumentException(premium.toString().toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.f18970e < 1) {
                    isPro();
                }
                int i3 = this.f18970e;
                int i4 = i3 + 1;
                this.f18970e = i4;
                bArr[i3] = (byte) c;
                i2++;
                int min = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < min) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.f18970e;
                        this.f18970e = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.f18970e < 2) {
                        isPro();
                    }
                    int i6 = this.f18970e;
                    int i7 = i6 + 1;
                    this.f18970e = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.f18970e = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.f18970e < 3) {
                        isPro();
                    }
                    int i8 = this.f18970e;
                    int i9 = i8 + 1;
                    this.f18970e = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.f18970e = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.f18970e = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.f18970e < 1) {
                            isPro();
                        }
                        int i12 = this.f18970e;
                        this.f18970e = i12 + 1;
                        bArr[i12] = (byte) 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.f18970e < 4) {
                            isPro();
                        }
                        int i14 = this.f18970e;
                        int i15 = i14 + 1;
                        this.f18970e = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.f18970e = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.f18970e = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.f18970e = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public AbstractC0362e adcel() {
        if (!((AbstractC0362e) this.f18969e).remoteconfig(this.f18970e)) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        AbstractC0362e ad = ((AbstractC0362e) this.f18969e).ad();
        if (ad == ((AbstractC0362e) this.f18969e)) {
            throw new IllegalStateException("implementation returned current curve");
        }
        synchronized (ad) {
            ad.purchase = this.f18970e;
            ad.billing = (C0961e) this.f18968e;
            ad.yandex = (AbstractC16982e) this.f18967e;
        }
        return ad;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public void amazon(C2561e c2561e, boolean z) {
        C13760e c13760e = (C13760e) this.f18969e;
        ?? r1 = c2561e.ad;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((C2401e) r1.get(i)).vip()) {
                m2616protected(c2561e);
                return;
            }
        }
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.f18968e;
        if (interfaceC0043e == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        AbstractC7595e.purchase(c2561e, interfaceC0043e.mo211this(0L), new C5337e(this, c13760e, 11), false);
        if (this.f18970e == 2) {
            if (z) {
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C2401e) r1.get(i2)).ad();
                }
            }
            C12309e c12309e = c2561e.vip;
            if (c12309e != null) {
                c12309e.f24694e = !c13760e.f27257e;
            }
        }
    }

    public int applovin() {
        int i = this.f18970e;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r9 != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r9.ad(r1, r6, r0) == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object billing(int r8, defpackage.InterfaceC5083e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C17337e
            if (r0 == 0) goto L13
            r0 = r9
            eٗۢؓ r0 = (defpackage.C17337e) r0
            int r1 = r0.f34019e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34019e = r1
            goto L18
        L13:
            eٗۢؓ r0 = new eٗۢؓ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f34020e
            int r1 = r0.f34019e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L47
            if (r1 == r4) goto L41
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            int r8 = r0.f34018e
            java.util.Iterator r1 = r0.f34021e
            eؙٟٗ r3 = r0.f34016e
            defpackage.AbstractC2003e.purchase(r9)
            goto L84
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            int r8 = r0.f34018e
            defpackage.AbstractC2003e.purchase(r9)
            goto L78
        L41:
            int r8 = r0.f34018e
            defpackage.AbstractC2003e.purchase(r9)
            goto L61
        L47:
            defpackage.AbstractC2003e.purchase(r9)
            r7.f18970e = r8
            eًًُ r9 = defpackage.C7801e.ad
            java.lang.Object r1 = r7.f18968e
            eًٙۡ r1 = (defpackage.InterfaceC8018e) r1
            java.lang.Object r6 = r7.f18967e
            eٌؔ٘ r6 = (defpackage.InterfaceC8467e) r6
            r0.f34018e = r8
            r0.f34019e = r4
            java.lang.Object r9 = r9.ad(r1, r6, r0)
            if (r9 != r5) goto L61
            goto L9e
        L61:
            eّٕٓ r9 = defpackage.AbstractC6731e.ad
            eؕۙۜ r9 = defpackage.ExecutorC3603e.f8134e
            eؚ٘ۥ r1 = new eؚ٘ۥ
            r4 = 25
            r6 = 0
            r1.<init>(r7, r6, r4)
            r0.f34018e = r8
            r0.f34019e = r3
            java.lang.Object r9 = defpackage.AbstractC5336e.advert(r9, r1, r0)
            if (r9 != r5) goto L78
            goto L9e
        L78:
            eؙٟٗ r9 = (defpackage.C6442e) r9
            java.lang.Object r1 = r7.f18969e
            eؒٛؕ r1 = (defpackage.C1169e) r1
            r3 = 0
            java.util.ListIterator r1 = r1.listIterator(r3)
            r3 = r9
        L84:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r1.next()
            eؘٕؓ r9 = (defpackage.InterfaceC5387e) r9
            r0.f34016e = r3
            r0.f34021e = r1
            r0.f34018e = r8
            r0.f34019e = r2
            java.lang.Object r9 = r7.m2613break(r9, r8, r3, r0)
            if (r9 != r5) goto L84
        L9e:
            return r5
        L9f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9556e.billing(int, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:9)(2:17|18))(7:19|20|21|22|(2:24|(1:26))|12|13)|10|11|12|13))|30|6|(0)(0)|10|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: break, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2613break(defpackage.InterfaceC5387e r5, int r6, defpackage.C6442e r7, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C15811e
            if (r0 == 0) goto L13
            r0 = r8
            eٕۣٕ r0 = (defpackage.C15811e) r0
            int r1 = r0.f31179e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31179e = r1
            goto L18
        L13:
            eٕۣٕ r0 = new eٕۣٕ
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f31180e
            int r1 = r0.f31179e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            int r6 = r0.f31183e
            eؙٟٗ r7 = r0.f31178e
            eؘٕؓ r5 = r0.f31181e
            defpackage.AbstractC2003e.purchase(r8)
            goto L61
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.AbstractC2003e.purchase(r8)
            r5.ad(r6, r7)     // Catch: java.lang.Throwable -> L3c
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r8 = move-exception
            eّۜۖ r1 = new eّۜۖ
            r1.<init>(r8)
            r8 = r1
        L43:
            java.lang.Throwable r1 = defpackage.C13523e.ad(r8)
            if (r1 == 0) goto L66
            r1.printStackTrace()
            r0.f31181e = r5
            r0.f31178e = r7
            r0.f31184e = r8
            r0.f31183e = r6
            r0.f31179e = r2
            r1 = 100
            java.lang.Object r8 = defpackage.AbstractC16481e.vip(r1, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r8 != r0) goto L61
            return r0
        L61:
            r5.ad(r6, r7)     // Catch: java.lang.Throwable -> L66
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L66
        L66:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9556e.m2613break(eؘٕؓ, int, eؙٟٗ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0987e
    public /* synthetic */ ListenableFuture call() {
        C2111e c2111e = (C2111e) this.f18968e;
        AbstractC17836e abstractC17836e = (AbstractC17836e) this.f18967e;
        int i = this.f18970e;
        ArrayList arrayList = (ArrayList) this.f18969e;
        ListenableFuture license = AbstractC2017e.license(abstractC17836e);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) AbstractC2017e.vip((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) c2111e.vip).get(i2) != null) {
                    throw new ClassCastException();
                }
                license = AbstractC2017e.billing(license, AbstractC9855e.vip(new C4132e(1)), EnumC3320e.f7489e);
            }
        }
        return license;
    }

    @Override // defpackage.InterfaceC16112e
    public void clear() {
        AbstractC0054e.license(this);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean contains(Object obj) {
        realm_value_t m4012break;
        InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj;
        C12575e c12575e = C12575e.f25237e;
        if ((interfaceC5045e != null ? ((C8648e) interfaceC5045e).ad : 0) == 11) {
            if (!C7290e.yandex(((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC10518e.class)))) {
                return false;
            }
        }
        C15816e c15816e = new C15816e(15);
        if (interfaceC5045e == null) {
            m4012break = c15816e.m4024try();
        } else {
            C8648e c8648e = (C8648e) interfaceC5045e;
            int i = c8648e.ad;
            switch (AbstractC8703e.m2467class(i)) {
                case 10:
                    InterfaceC14287e startapp = c8648e.startapp(AbstractC3820e.ad.vip(InterfaceC14287e.class));
                    if (startapp != null) {
                        C13655e f36702e = ((InterfaceC10518e) startapp).getF36702e();
                        r0 = f36702e != null ? f36702e : null;
                        if (r0 == null) {
                            throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
                        }
                    }
                    m4012break = c15816e.m4012break(r0);
                    break;
                case 11:
                case 12:
                    throw new IllegalArgumentException("Cannot pass unmanaged collections as input argument");
                default:
                    switch (AbstractC8703e.m2467class(i)) {
                        case 0:
                            m4012break = c15816e.m4025while(Long.valueOf(c8648e.purchase()));
                            break;
                        case 1:
                            m4012break = c15816e.adcel(Boolean.valueOf(c8648e.ad()));
                            break;
                        case 2:
                            m4012break = c15816e.m4015default(c8648e.mopub());
                            break;
                        case 3:
                            m4012break = c15816e.advert(c8648e.vip());
                            break;
                        case 4:
                            m4012break = c15816e.m4019implements((C2577e) c8648e.yandex());
                            break;
                        case 5:
                            m4012break = c15816e.firebase(Float.valueOf(c8648e.appmetrica()));
                            break;
                        case 6:
                            m4012break = c15816e.applovin(Double.valueOf(c8648e.license()));
                            break;
                        case 7:
                            m4012break = c15816e.inmobi(c8648e.metrica());
                            break;
                        case 8:
                            m4012break = c12575e.applovin(c8648e.billing().yandex());
                            break;
                        case 9:
                            m4012break = c12575e.m3368interface(((C7588e) c8648e.adcel()).ad);
                            break;
                        default:
                            throw new UnsupportedOperationException("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                    }
            }
        }
        realm_value_t realm_value_tVar = m4012break;
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f18969e).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_set_find(ptr$cinterop_release, realm_value_tVar.ad, realm_value_tVar, new long[1], zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean crashlytics(Object obj, int i, LinkedHashMap linkedHashMap) {
        boolean signatures = signatures((InterfaceC5045e) obj, i, linkedHashMap);
        purchase(startapp() + 1);
        return signatures;
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f18970e;
        byte[] bArr2 = new byte[i2];
        AbstractC9567e abstractC9567e = (AbstractC9567e) this.f18968e;
        abstractC9567e.doFinal(bArr2, 0);
        byte[] bArr3 = (byte[]) this.f18969e;
        abstractC9567e.update(bArr3, 0, bArr3.length);
        abstractC9567e.update(bArr2, 0, i2);
        int doFinal = abstractC9567e.doFinal(bArr, 0);
        reset();
        return doFinal;
    }

    /* renamed from: extends, reason: not valid java name */
    public boolean m2614extends() {
        boolean isEmpty;
        synchronized (this.f18967e) {
            isEmpty = ((ArrayDeque) this.f18968e).isEmpty();
        }
        return isEmpty;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC10630e
    public int generateBytes(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f18970e;
        ?? r0 = this.f18968e;
        if (i2 <= 0) {
            throw new IllegalArgumentException("len must be > 0");
        }
        if (bArr.length - i2 < 0) {
            throw new RuntimeException("output buffer too small");
        }
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = new byte[4];
        r0.reset();
        int i5 = 1;
        int i6 = 0;
        if (i2 > i4) {
            while (true) {
                ad(i5, bArr3);
                r0.update(bArr3, 0, 4);
                byte[] bArr4 = (byte[]) this.f18967e;
                r0.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = (byte[]) this.f18969e;
                r0.update(bArr5, 0, bArr5.length);
                r0.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i6, i4);
                i6 += i4;
                i3 = i5 + 1;
                if (i5 >= i2 / i4) {
                    break;
                }
                i5 = i3;
            }
            i5 = i3;
        }
        if (i6 < i2) {
            ad(i5, bArr3);
            r0.update(bArr3, 0, 4);
            byte[] bArr6 = (byte[]) this.f18967e;
            r0.update(bArr6, 0, bArr6.length);
            byte[] bArr7 = (byte[]) this.f18969e;
            r0.update(bArr7, 0, bArr7.length);
            r0.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i6, i2 - i6);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        C7646e c7646e = (C7646e) this.f18968e;
        C11694e c11694e = (C11694e) this.f18969e;
        C5084e c5084e = (C5084e) this.f18967e;
        int i = this.f18970e;
        switch (i) {
            case 0:
                C12383e c12383e = (C12383e) c11694e.vip.get();
                C8591e c8591e = (C8591e) c5084e.adcel.get();
                if (c11694e.metrica.get() == null) {
                    return new C6455e(c12383e, c8591e, (InterfaceC7865e) c11694e.advert.get(), c11694e.adcel, c11694e.startapp, c11694e.yandex);
                }
                throw new ClassCastException();
            case 1:
                C17964e c17964e = c11694e.ad;
                C5241e c5241e = (C5241e) c5084e.inmobi.get();
                c17964e.getClass();
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                }
                return new C12383e(new C8430e(c17964e, 0), c5241e, c17964e.vip, new C8430e(c17964e, 1));
            case 2:
                c11694e.ad.getClass();
                return null;
            case 3:
                return new C15062e(c11694e.mopub, (C8591e) c5084e.adcel.get());
            case 4:
                return new C12810e(c11694e.yandex, c11694e.appmetrica, (C12383e) c11694e.vip.get(), c11694e.adcel, (C8591e) c5084e.adcel.get(), (C4373e) c7646e.ad.f6389e);
            case 5:
                return C17003e.metrica ? (InterfaceC1373e) c11694e.billing.get() : (InterfaceC1373e) c11694e.purchase.get();
            case 6:
                C11901e c11901e = (C11901e) c11694e.license.get();
                C13583e c13583e = (C13583e) c5084e.admob.get();
                C17425e c17425e = (C17425e) c5084e.Signature.get();
                C12610e c12610e = (C12610e) c5084e.pro.get();
                C8591e c8591e2 = (C8591e) c5084e.adcel.get();
                C3154e c3154e = (C3154e) c5084e.advert.get();
                C1209e c1209e = (C1209e) c5084e.startapp.get();
                return new C3499e(c11901e, c13583e, c17425e, c12610e, c8591e2, c3154e, c1209e.ad().ad(UseTorchAsFlashQuirk.class) ? new C12916e(c1209e, c5084e.vip.ad(), (C12398e) c5084e.crashlytics.get()) : C17354e.f34048e, (C13825e) c5084e.license.get(), c11694e.appmetrica, (C12383e) c11694e.vip.get());
            case 7:
                C13825e c13825e = (C13825e) c5084e.license.get();
                c5084e.ad();
                Object obj = new Object();
                C6434e c6434e = InterfaceC2531e.yandex;
                InterfaceC2531e interfaceC2531e = c13825e.vip;
                c6434e.getClass();
                C6434e.vip(interfaceC2531e);
                return obj;
            case 8:
                return new C16170e((C12383e) c11694e.vip.get(), c5084e.ad());
            case 9:
                return new C17003e((C13825e) c5084e.license.get(), c11694e.purchase, (C8591e) c5084e.adcel.get(), (C17425e) c5084e.Signature.get());
            case 10:
                C8591e c8591e3 = (C8591e) c5084e.adcel.get();
                C9872e c9872e = (C9872e) c7646e.ad.f6385e;
                AbstractC1513e.appmetrica(c9872e);
                C3909e ad = ((C1209e) c5084e.startapp.get()).ad();
                return new C11728e(c8591e3, c9872e, (ad.ad(ConfigureSurfaceToSecondarySessionFailQuirk.class) || ad.ad(PreviewOrientationIncorrectQuirk.class) || ad.ad(TextureViewIsClosedQuirk.class)) ? new C17424e(25) : C16628e.f32605e, (C8020e) c11694e.startapp.get());
            case 11:
                C8020e c8020e = c11694e.ad.metrica;
                AbstractC1513e.appmetrica(c8020e);
                return c8020e;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.InterfaceC16112e
    public Object get(int i) {
        int i2;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f18969e;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i3 = AbstractC6026e.ad;
        realmcJNI.realm_set_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        C17974e c17974e = (C17974e) this.f18968e;
        InterfaceC15348e interfaceC15348e = (InterfaceC15348e) this.f18967e;
        int i4 = 0;
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (!z) {
            if (z) {
                throw new C14803e(10);
            }
            int realm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
            int[] m2468interface = AbstractC8703e.m2468interface(14);
            int length = m2468interface.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i2 = 0;
                    break;
                }
                i2 = m2468interface[i5];
                if (AbstractC8703e.m2467class(i2) == realm_value_t_type_get) {
                    break;
                }
                i5++;
            }
            if (i2 == 0) {
                throw new IllegalStateException(("Unknown value type: " + realm_value_t_type_get).toString());
            }
            switch (AbstractC8703e.m2467class(i2)) {
                case 0:
                    break;
                case 1:
                    return new C8648e(1, AbstractC3820e.ad.vip(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)));
                case 2:
                    return new C8648e(2, AbstractC3820e.ad.vip(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)));
                case 3:
                    return new C8648e(3, AbstractC3820e.ad.vip(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar));
                case 4:
                    realm_binary_t ad = realm_value_tVar.ad();
                    return new C8648e(4, AbstractC3820e.ad.vip(byte[].class), realmcJNI.realm_binary_t_data_get(ad.ad, ad));
                case 5:
                    return new C8648e(5, AbstractC3820e.ad.vip(InterfaceC6025e.class), new C2577e(AbstractC15871e.vip(realm_value_tVar)));
                case 6:
                    return new C8648e(6, AbstractC3820e.ad.vip(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.ad, realm_value_tVar)));
                case 7:
                    return new C8648e(7, AbstractC3820e.ad.vip(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.ad, realm_value_tVar)));
                case 8:
                    realm_decimal128_t metrica = realm_value_tVar.metrica();
                    long[] realm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(metrica.ad, metrica);
                    long[] copyOf = Arrays.copyOf(realm_decimal128_t_w_get, realm_decimal128_t_w_get.length);
                    C9131e c9131e = C12355e.Companion;
                    long j2 = copyOf[1];
                    long j3 = copyOf[0];
                    c9131e.getClass();
                    return new C8648e(8, AbstractC3820e.ad.vip(C12355e.class), C9131e.ad(j2, j3));
                case 9:
                    BsonObjectId$Companion bsonObjectId$Companion = C2453e.Companion;
                    byte[] bArr = new byte[12];
                    realm_object_id_t license = realm_value_tVar.license();
                    short[] realm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(license.ad, license);
                    ArrayList arrayList = new ArrayList(realm_object_id_t_bytes_get.length);
                    int length2 = realm_object_id_t_bytes_get.length;
                    int i6 = 0;
                    while (i4 < length2) {
                        bArr[i6] = (byte) realm_object_id_t_bytes_get[i4];
                        arrayList.add(Unit.INSTANCE);
                        i4++;
                        i6++;
                    }
                    bsonObjectId$Companion.getClass();
                    return new C8648e(9, AbstractC3820e.ad.vip(C2453e.class), BsonObjectId$Companion.ad(bArr));
                case 10:
                    C12232e c12232e = AbstractC3820e.ad;
                    return new C8648e(11, c12232e.vip(InterfaceC16120e.class), (InterfaceC16120e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 0 ? AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), c12232e.vip(InterfaceC16120e.class), c17974e, interfaceC15348e) : null));
                case 11:
                    byte[] bArr2 = new byte[16];
                    realm_uuid_t appmetrica = realm_value_tVar.appmetrica();
                    short[] realm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(appmetrica.ad, appmetrica);
                    ArrayList arrayList2 = new ArrayList(realm_uuid_t_bytes_get.length);
                    int length3 = realm_uuid_t_bytes_get.length;
                    int i7 = 0;
                    while (i4 < length3) {
                        bArr2[i7] = (byte) realm_uuid_t_bytes_get[i4];
                        arrayList2.add(Unit.INSTANCE);
                        i4++;
                        i7++;
                    }
                    return new C8648e(10, AbstractC3820e.ad.vip(InterfaceC17159e.class), new C7588e(bArr2));
                case 12:
                    throw new IllegalStateException("Set should never container lists");
                case 13:
                    throw new IllegalStateException("Set should never container dictionaries");
                default:
                    throw new IllegalArgumentException("Unsupported type: ".concat(AbstractC8647e.m2456extends(i2)));
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return ((AbstractC9567e) this.f18968e).getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f18970e;
    }

    @Override // defpackage.InterfaceC16112e
    /* renamed from: goto */
    public boolean mo2159goto(InterfaceC11775e interfaceC11775e, int i, Map map) {
        return AbstractC0054e.ad(this, interfaceC11775e, i, map);
    }

    /* renamed from: implements, reason: not valid java name */
    public synchronized C0560e m2615implements(C2680e c2680e) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(c2680e.toString()));
            }
            if (!((ServiceConnectionC15550e) this.f18969e).license(c2680e)) {
                ServiceConnectionC15550e serviceConnectionC15550e = new ServiceConnectionC15550e(this);
                this.f18969e = serviceConnectionC15550e;
                serviceConnectionC15550e.license(c2680e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2680e.vip.ad;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        byte[] bArr = (byte[]) this.f18967e;
        AbstractC9567e abstractC9567e = (AbstractC9567e) this.f18968e;
        abstractC9567e.reset();
        byte[] bArr2 = ((C14915e) interfaceC3894e).f29591e;
        if (bArr2.length > 64) {
            abstractC9567e.update(bArr2, 0, bArr2.length);
            abstractC9567e.doFinal(bArr, 0);
            for (int i = this.f18970e; i < bArr.length; i++) {
                bArr[i] = 0;
            }
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            for (int length = bArr2.length; length < bArr.length; length++) {
                bArr[length] = 0;
            }
        }
        byte[] bArr3 = new byte[bArr.length];
        this.f18969e = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ 54);
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = (byte[]) this.f18969e;
            if (i3 >= bArr4.length) {
                abstractC9567e.update(bArr, 0, bArr.length);
                return;
            } else {
                bArr4[i3] = (byte) (bArr4[i3] ^ 92);
                i3++;
            }
        }
    }

    @Override // defpackage.InterfaceC10630e
    public void init(InterfaceC13829e interfaceC13829e) {
        if (!(interfaceC13829e instanceof C0369e)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        C0369e c0369e = (C0369e) interfaceC13829e;
        this.f18967e = c0369e.vip;
        this.f18969e = c0369e.ad;
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: interface */
    public void mo2225interface(String str) {
        int i;
        pro(0, str.length() + 2);
        char[] cArr = (char[]) this.f18969e;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            byte[] bArr = AbstractC13517e.vip;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    pro(i3, 2);
                    char charAt = str.charAt(i4);
                    byte[] bArr2 = AbstractC13517e.vip;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i3 + 1;
                            ((char[]) this.f18969e)[i3] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = AbstractC13517e.ad[charAt];
                                pro(i3, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.f18969e, i3);
                                i3 = str2.length() + i3;
                            } else {
                                char[] cArr2 = (char[]) this.f18969e;
                                cArr2[i3] = '\\';
                                cArr2[i3 + 1] = (char) b;
                                i3 += 2;
                            }
                        }
                    } else {
                        i = i3 + 1;
                        ((char[]) this.f18969e)[i3] = charAt;
                    }
                    i3 = i;
                }
                pro(i3, 1);
                char[] cArr3 = (char[]) this.f18969e;
                cArr3[i3] = '\"';
                m2612abstract(cArr3, i3 + 1);
                isPro();
                return;
            }
            i3++;
        }
        cArr[i2] = '\"';
        m2612abstract(cArr, length + 2);
        isPro();
    }

    public void isPro() {
        ((BufferedOutputStream) this.f18968e).write((byte[]) this.f18967e, 0, this.f18970e);
        this.f18970e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, eُۡٔ] */
    @Override // defpackage.InterfaceC7898e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void license(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f18968e
            r3 = r0
            eؘؑۛ r3 = (defpackage.C0140e) r3
            java.lang.Object r0 = r13.f18967e
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r13.f18970e
            java.lang.Object r1 = r13.f18969e
            r2 = r1
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r5 = r14
            android.os.Bundle r5 = (android.os.Bundle) r5
            eٍّٔ r14 = r3.ad
            defpackage.AbstractC9528e.startapp(r14)
            eٌۨٙ r7 = r3.vip
            r1 = 3
            r8 = 0
            r9 = 1
            java.lang.String r10 = "register callback = %s"
            r4 = 2
            if (r0 == r1) goto L26
            if (r0 != r4) goto L5b
            r0 = r4
        L26:
            eٕؒؓ r1 = r3.metrica
            eُۡٔ r11 = new eُۡٔ
            r11.<init>()
            r11.f22774e = r3
            r11.f22772e = r1
            r11.f22771e = r6
            eََٜ r1 = new eََٜ
            r1.<init>(r11)
            r11.f22770e = r1
            eًّۘ r1 = new eًّۘ
            r12 = 7
            r1.<init>(r12, r11)
            r14.ad(r1)
            if (r7 == 0) goto L5b
            eِٕۡ r1 = new eِٕۡ
            r1.<init>(r9, r11)
            eۥَ r11 = defpackage.C9149e.billing
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r1
            r11.vip(r10, r12)
            defpackage.AbstractC9528e.appmetrica()
            java.util.Set r11 = r7.vip
            r11.add(r1)
        L5b:
            if (r0 == r9) goto L5f
            if (r0 != r4) goto L88
        L5f:
            eٕؒؓ r4 = r3.metrica
            eؑؓٞ r1 = new eؑؓٞ
            r1.<init>(r2, r3, r4, r5, r6)
            eؔٚٚ r0 = new eؔٚٚ
            r2 = 26
            r0.<init>(r2, r1)
            r14.ad(r0)
            if (r7 == 0) goto L88
            eِٕۡ r14 = new eِٕۡ
            r14.<init>(r8, r1)
            eۥَ r0 = defpackage.C9149e.billing
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r8] = r14
            r0.vip(r10, r1)
            defpackage.AbstractC9528e.appmetrica()
            java.util.Set r0 = r7.vip
            r0.add(r14)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9556e.license(java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC16112e
    public InterfaceC16112e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C9556e((C17974e) this.f18968e, interfaceC15348e, longPointerWrapper);
    }

    public Object mopub() {
        Object removeLast;
        synchronized (this.f18967e) {
            removeLast = ((ArrayDeque) this.f18968e).removeLast();
        }
        return removeLast;
    }

    public void pro(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f18969e;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f18969e = Arrays.copyOf(cArr, i3);
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public void m2616protected(C2561e c2561e) {
        if (this.f18970e == 2) {
            InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.f18968e;
            if (interfaceC0043e == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            AbstractC7595e.purchase(c2561e, interfaceC0043e.mo211this(0L), new C17097e(26, (C13760e) this.f18969e), true);
        }
        this.f18970e = 3;
    }

    @Override // defpackage.InterfaceC16112e
    public void purchase(int i) {
        this.f18970e = i;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean remoteconfig(Collection collection, int i, Map map) {
        return AbstractC0054e.vip(this, collection, i, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (defpackage.C7290e.yandex(((defpackage.C8648e) r12).startapp(defpackage.AbstractC3820e.ad.vip(defpackage.InterfaceC10518e.class))) == false) goto L44;
     */
    @Override // defpackage.InterfaceC16112e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9556e.remove(java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC16112e
    public boolean removeAll(Collection collection) {
        return AbstractC0054e.amazon(this, collection);
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        AbstractC9567e abstractC9567e = (AbstractC9567e) this.f18968e;
        abstractC9567e.reset();
        byte[] bArr = (byte[]) this.f18967e;
        abstractC9567e.update(bArr, 0, bArr.length);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean signatures(Object obj, int i, Map map) {
        C15816e c15816e = new C15816e(15);
        boolean booleanValue = ((Boolean) AbstractC6503e.vip(c15816e, (InterfaceC5045e) obj, new C14772e(2, this), new C5888e(this, i, map, c15816e), new C3114e(12), new C3114e(13))).booleanValue();
        c15816e.m4020interface();
        return booleanValue;
    }

    @Override // defpackage.InterfaceC16112e
    public int startapp() {
        return this.f18970e;
    }

    @Override // defpackage.InterfaceC9483e
    public void subs(char c) {
        byte[] bArr = (byte[]) this.f18967e;
        if (c < 128) {
            if (bArr.length - this.f18970e < 1) {
                isPro();
            }
            int i = this.f18970e;
            this.f18970e = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.f18970e < 2) {
                isPro();
            }
            int i2 = this.f18970e;
            int i3 = i2 + 1;
            this.f18970e = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f18970e = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.f18970e < 1) {
                isPro();
            }
            int i4 = this.f18970e;
            this.f18970e = i4 + 1;
            bArr[i4] = (byte) 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.f18970e < 3) {
                isPro();
            }
            int i5 = this.f18970e;
            int i6 = i5 + 1;
            this.f18970e = i6;
            bArr[i5] = (byte) 224;
            int i7 = i5 + 2;
            this.f18970e = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.f18970e = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new IllegalArgumentException(AbstractC1786e.admob(c, "Unexpected code point: "));
        }
        if (bArr.length - this.f18970e < 4) {
            isPro();
        }
        int i8 = this.f18970e;
        int i9 = i8 + 1;
        this.f18970e = i9;
        bArr[i8] = (byte) 240;
        int i10 = i8 + 2;
        this.f18970e = i10;
        bArr[i9] = (byte) 128;
        int i11 = i8 + 3;
        this.f18970e = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.f18970e = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    @Override // defpackage.InterfaceC7218e
    public byte[] tapsense(int i, byte[] bArr) {
        C12307e c12307e = (C12307e) this.f18968e;
        if (i > this.f18970e) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) c12307e.get()).update(bArr);
        return Arrays.copyOf(((Mac) c12307e.get()).doFinal(), i);
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: this */
    public void mo2228this(String str) {
        int length = str.length();
        pro(0, length);
        str.getChars(0, length, (char[]) this.f18969e, 0);
        m2612abstract((char[]) this.f18969e, length);
    }

    /* renamed from: try, reason: not valid java name */
    public void m2617try() {
        HandlerThread handlerThread;
        synchronized (this.f18968e) {
            try {
                AbstractC2301e.subscription(this.f18970e > 0);
                int i = this.f18970e - 1;
                this.f18970e = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f18969e) != null) {
                    handlerThread.quit();
                    this.f18969e = null;
                    this.f18967e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        ((AbstractC9567e) this.f18968e).update(b);
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        ((AbstractC9567e) this.f18968e).update(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC16112e
    public NativePointer vip() {
        return (LongPointerWrapper) this.f18969e;
    }

    /* renamed from: while, reason: not valid java name */
    public Looper m2618while() {
        Looper looper;
        synchronized (this.f18968e) {
            try {
                if (((Looper) this.f18967e) == null) {
                    AbstractC2301e.subscription(this.f18970e == 0 && ((HandlerThread) this.f18969e) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f18969e = handlerThread;
                    handlerThread.start();
                    this.f18967e = ((HandlerThread) this.f18969e).getLooper();
                }
                this.f18970e++;
                looper = (Looper) this.f18967e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    @Override // defpackage.InterfaceC9483e
    public void writeLong(long j) {
        mo2228this(String.valueOf(j));
    }

    @Override // defpackage.InterfaceC2750e
    public InterfaceC15348e yandex() {
        return (InterfaceC15348e) this.f18967e;
    }
}
