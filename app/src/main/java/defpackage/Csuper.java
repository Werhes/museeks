package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteOrder;
import java.security.cert.PKIXBuilderParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* renamed from: super, reason: invalid class name */
/* loaded from: classes3.dex */
public class Csuper implements InterfaceC11206e, InterfaceC4777e, InterfaceC10630e, InterfaceC14309e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f36469e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f36470e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f36471e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36472e;

    public Csuper(byte b, int i) {
        this.f36472e = i;
        switch (i) {
            case 15:
                this.f36469e = new int[16];
                this.f36471e = new C12718e();
                return;
            case 16:
                this.f36472e = 16;
                this.f36469e = new Object[2];
                this.f36471e = new long[2];
                return;
            case 21:
                this.f36469e = new C12431e(0, new C4763e[16]);
                return;
            default:
                this.f36469e = new WeakHashMap();
                this.f36471e = new BigInteger[8];
                this.f36470e = 0;
                return;
        }
    }

    public /* synthetic */ Csuper(char c, int i) {
        this.f36472e = i;
    }

    public Csuper(int i) {
        this.f36472e = 13;
        this.f36469e = new Object[i * 2];
        this.f36470e = 0;
    }

    public Csuper(int i, C8010e c8010e) {
        this.f36472e = 29;
        this.f36470e = i;
        this.f36469e = c8010e;
        this.f36471e = new C1292e();
    }

    public Csuper(ImageView imageView) {
        this.f36472e = 2;
        this.f36470e = 0;
        this.f36469e = imageView;
    }

    public Csuper(InterfaceC0293e interfaceC0293e) {
        this.f36472e = 17;
        this.f36469e = interfaceC0293e;
        this.f36470e = interfaceC0293e.getDigestSize();
    }

    public Csuper(C5537e c5537e, C18424e c18424e, int i) {
        this.f36472e = 19;
        this.f36471e = c5537e;
        this.f36469e = c18424e;
        this.f36470e = i;
    }

    public Csuper(C6107e c6107e) {
        this.f36472e = 23;
        this.f36470e = 5;
        this.f36471e = new HashSet();
        this.f36469e = c6107e;
    }

    public Csuper(C11180e c11180e) {
        this.f36472e = 27;
        this.f36469e = new SparseArray();
        this.f36471e = c11180e;
        this.f36470e = -1;
    }

    public Csuper(C11388e c11388e) {
        this.f36472e = 10;
        this.f36469e = c11388e;
        this.f36471e = new C12431e(0, new Function1[16]);
    }

    public Csuper(InterfaceC11678e interfaceC11678e) {
        this.f36472e = 5;
        this.f36469e = interfaceC11678e;
    }

    public Csuper(C13506e c13506e, C10861e c10861e) {
        this.f36472e = 4;
        this.f36469e = c13506e;
        this.f36471e = c10861e;
        if (c10861e.vip == 1 && c10861e.metrica == 1) {
            this.f36470e = 1 << c10861e.ad;
            return;
        }
        throw new IllegalArgumentException(("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + c10861e + " was passed").toString());
    }

    public Csuper(C15008e c15008e, int i) {
        this.f36472e = 11;
        this.f36469e = c15008e;
        this.f36470e = i;
        this.f36471e = new C14829e(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Csuper(defpackage.C15926e r13, defpackage.AbstractC7150e r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.<init>(eٖؑۡ, eؚٔؑ):void");
    }

    public /* synthetic */ Csuper(Object obj, int i, Serializable serializable, int i2) {
        this.f36472e = i2;
        this.f36469e = obj;
        this.f36470e = i;
        this.f36471e = serializable;
    }

    public /* synthetic */ Csuper(Object obj, Object obj2, int i, int i2) {
        this.f36472e = i2;
        this.f36469e = obj;
        this.f36471e = obj2;
        this.f36470e = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eٍۣؐ] */
    public Csuper(String str, int i) {
        this.f36472e = 12;
        this.f36469e = str;
        this.f36470e = i;
        C9964e c9964e = new C9964e();
        C2109e c2109e = new C2109e(8, this);
        InterfaceC4911e interfaceC4911e = AbstractC1515e.ad;
        int i2 = 2;
        c9964e.ad(C15210e.vip, new C2046e(i2, c2109e));
        c9964e.ad(AbstractC15641e.license, new C14407e(17));
        Unit unit = Unit.INSTANCE;
        Function1 function1 = (Function1) c9964e.f19685e;
        ?? obj = new Object();
        obj.ad = new C4526e(i2);
        obj.metrica = 10;
        function1.invoke(obj);
        C14947e c14947e = new C14947e(obj);
        C9398e c9398e = new C9398e(c14947e, c9964e, true);
        ((InterfaceC10500e) c9398e.f18702e.mo397public(C4524e.f9798e)).mo692else(new C2109e(3, c14947e));
        this.f36471e = c9398e;
    }

    public Csuper(PKIXBuilderParameters pKIXBuilderParameters) {
        this.f36472e = 23;
        this.f36470e = 5;
        this.f36471e = new HashSet();
        this.f36469e = new C6107e(new C8765e(pKIXBuilderParameters));
        this.f36470e = pKIXBuilderParameters.getMaxPathLength();
    }

    public Csuper(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f36472e = 1;
        this.f36469e = arrayList;
        this.f36470e = i;
        this.f36471e = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    public Csuper(CopyOnWriteArrayList copyOnWriteArrayList, int i, C18208e c18208e) {
        this.f36472e = 20;
        this.f36471e = copyOnWriteArrayList;
        this.f36470e = i;
        this.f36469e = c18208e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d9, code lost:
    
        if (r11.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01db, code lost:
    
        r0 = new defpackage.C17424e(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f4, code lost:
    
        if (r12 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f7, code lost:
    
        if (r12 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f9, code lost:
    
        r17 = (int[]) r0.f34142e;
        r18 = (float[]) r0.f34141e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0207, code lost:
    
        if (r13 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0209, code lost:
    
        if (r13 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021c, code lost:
    
        r12 = new android.graphics.LinearGradient(r22, r25, r26, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0266, code lost:
    
        return new defpackage.Csuper(r12, (java.lang.Object) null, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0216, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0220, code lost:
    
        r12 = new android.graphics.SweepGradient(r8, r10, (int[]) r0.f34142e, (float[]) r0.f34141e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0234, code lost:
    
        r1 = (int[]) r0.f34142e;
        r22 = (float[]) r0.f34141e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0241, code lost:
    
        if (r13 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0244, code lost:
    
        if (r13 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0246, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0259, code lost:
    
        r12 = new android.graphics.RadialGradient(r8, r10, r24, r1, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0253, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        r0 = new defpackage.C17424e(r6, r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ee, code lost:
    
        r0 = new defpackage.C17424e(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.Csuper amazon(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.amazon(android.content.res.Resources, int, android.content.res.Resources$Theme):super");
    }

    /* renamed from: default, reason: not valid java name */
    private final /* synthetic */ void m4636default() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [byte[], java.io.Serializable] */
    /* renamed from: final, reason: not valid java name */
    public static Csuper m4637final(RandomAccessFile randomAccessFile) {
        String mopub = AbstractC1983e.mopub(randomAccessFile, 4);
        int smaato = (int) AbstractC1983e.smaato(randomAccessFile);
        if (smaato < 8) {
            throw new Exception("Corrupt file: RealAudio chunk length at position " + (randomAccessFile.getFilePointer() - 4) + " cannot be less than 8");
        }
        if (smaato <= (randomAccessFile.length() - randomAccessFile.getFilePointer()) + 8) {
            ?? r2 = new byte[smaato - 8];
            randomAccessFile.readFully(r2);
            return new Csuper(mopub, smaato, (Serializable) r2, 24);
        }
        StringBuilder premium = AbstractC4653e.premium("Corrupt file: RealAudio chunk length of ", smaato, " at position ");
        premium.append(randomAccessFile.getFilePointer() - 4);
        premium.append(" extends beyond the end of the file");
        throw new Exception(premium.toString());
    }

    /* renamed from: private, reason: not valid java name */
    public static int m4639private(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((C13481e) list.get(i3)).ad - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void vip(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    public boolean Signature() {
        C12431e c12431e = (C12431e) this.f36471e;
        int i = this.f36470e - 1;
        this.f36470e = i;
        if (i == 0 && c12431e.f24868e != 0) {
            C11388e c11388e = (C11388e) this.f36469e;
            C12380e c12380e = c11388e.ad;
            InterfaceC12006e interfaceC12006e = c11388e.vip;
            c12380e.vip.ad().admob();
            C2573e c2573e = c12380e.vip;
            Object[] objArr = c12431e.f24870e;
            int i2 = c12431e.f24868e;
            for (int i3 = 0; i3 < i2; i3++) {
                ((Function1) objArr[i3]).invoke(c2573e);
            }
            c11388e.advert(c2573e);
            C12380e.ad(c12380e, interfaceC12006e, false, 1);
            c12380e.license(true);
            c12431e.startapp();
        }
        return this.f36470e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eًۧٗ, strictfp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eًۧٗ, strictfp] */
    /* renamed from: abstract, reason: not valid java name */
    public C8367e m4640abstract(int i, int i2) {
        crashlytics m4654super = m4654super();
        int i3 = m4654super.f1117e;
        if (i3 == 1) {
            return new Cstrictfp(3, i, i2, m4654super.adcel(0));
        }
        C5308e c5308e = AbstractC2725e.ad;
        return new Cstrictfp(4, i, i2, i3 < 1 ? AbstractC2725e.ad : new Ccatch(m4654super));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    @Override // defpackage.InterfaceC4777e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C18451e ad(defpackage.InterfaceC2283e r23, long r24) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.ad(eَؔؐ, long):eُۣ");
    }

    public AbstractC8507e adcel() {
        return smaato();
    }

    public void admob(int i, int i2) {
        if (i > 131072) {
            AbstractC8889e.ad("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.f36469e;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            AbstractC1660e.Signature(i2, 0, (int[]) this.f36469e, iArr2, 12);
            this.f36469e = iArr2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|(2:14|15)(2:17|18))(2:19|20))(2:21|(5:23|24|25|(1:27)|28)(2:29|30)))(2:31|32))(3:56|57|(2:59|42)(1:60))|33|34|(6:36|37|38|39|(1:41)|(0)(0))(2:45|(4:47|48|49|50)(2:54|55))|42))|65|6|7|(0)(0)|33|34|(0)(0)|42) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r14 == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0036, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r14 = new defpackage.C12763e(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004b, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r14 = new defpackage.C12763e(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0031, B:14:0x00db, B:15:0x00e2, B:17:0x00e3, B:18:0x00f8, B:21:0x0041, B:23:0x00a8, B:29:0x00ab, B:30:0x00b2, B:34:0x007b, B:36:0x0088, B:39:0x0096, B:45:0x00b3, B:47:0x00bb, B:50:0x00c9, B:54:0x00f9, B:55:0x0110), top: B:7:0x0029, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0031, B:14:0x00db, B:15:0x00e2, B:17:0x00e3, B:18:0x00f8, B:21:0x0041, B:23:0x00a8, B:29:0x00ab, B:30:0x00b2, B:34:0x007b, B:36:0x0088, B:39:0x0096, B:45:0x00b3, B:47:0x00bb, B:50:0x00c9, B:54:0x00f9, B:55:0x0110), top: B:7:0x0029, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0031, B:14:0x00db, B:15:0x00e2, B:17:0x00e3, B:18:0x00f8, B:21:0x0041, B:23:0x00a8, B:29:0x00ab, B:30:0x00b2, B:34:0x007b, B:36:0x0088, B:39:0x0096, B:45:0x00b3, B:47:0x00bb, B:50:0x00c9, B:54:0x00f9, B:55:0x0110), top: B:7:0x0029, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0031, B:14:0x00db, B:15:0x00e2, B:17:0x00e3, B:18:0x00f8, B:21:0x0041, B:23:0x00a8, B:29:0x00ab, B:30:0x00b2, B:34:0x007b, B:36:0x0088, B:39:0x0096, B:45:0x00b3, B:47:0x00bb, B:50:0x00c9, B:54:0x00f9, B:55:0x0110), top: B:7:0x0029, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable ads(defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.ads(eُؑ۠):java.io.Serializable");
    }

    public AbstractC8507e advert() {
        return mopub(false);
    }

    public int applovin(Object obj) {
        C17866e c17866e = (C17866e) this.f36469e;
        int license = c17866e.license(obj);
        if (license >= 0) {
            return c17866e.metrica[license];
        }
        return -1;
    }

    public void appmetrica(int i, InterfaceC12259e interfaceC12259e) {
        if (i < 0) {
            AbstractC8889e.ad("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C4763e c4763e = new C4763e(this.f36470e, i, interfaceC12259e);
        this.f36470e += i;
        ((C12431e) this.f36469e).license(c4763e);
    }

    public void billing() {
        C0142e c0142e;
        ImageView imageView = (ImageView) this.f36469e;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC13982e.ad(drawable);
        }
        if (drawable == null || (c0142e = (C0142e) this.f36471e) == null) {
            return;
        }
        C17264e.appmetrica(drawable, c0142e, imageView.getDrawableState());
    }

    /* renamed from: break, reason: not valid java name */
    public void m4641break(C6913e c6913e, int i, int i2, C16975e c16975e, int i3, Object obj, long j, long j2, int i4) {
        loadAd(new C1308e(this, c6913e, new C0807e(i, i2, c16975e, i3, obj, AbstractC9413e.m2567switch(j), AbstractC9413e.m2567switch(j2)), i4));
    }

    /* renamed from: case */
    public Csuper mo3901case(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f36470e) * 2;
            Object[] objArr = (Object[]) this.f36469e;
            if (size > objArr.length) {
                this.f36469e = Arrays.copyOf(objArr, AbstractC13584e.vip(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo3904implements(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* renamed from: catch */
    public Csuper mo3902catch(Map map) {
        return mo3901case(map.entrySet());
    }

    /* renamed from: class, reason: not valid java name */
    public int m4642class() {
        return ((C11388e) this.f36469e).license().f33322e.length();
    }

    public String crashlytics() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f36470e + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f36469e)[i2];
            if (obj instanceof InterfaceC9998e) {
                InterfaceC9998e interfaceC9998e = (InterfaceC9998e) obj;
                if (!AbstractC7890e.billing(interfaceC9998e.appmetrica(), C3016e.appmetrica)) {
                    int i3 = ((int[]) this.f36471e)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC9998e.billing(i3));
                    }
                } else if (((int[]) this.f36471e)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f36471e)[i2]);
                    sb.append("]");
                }
            } else if (obj != C9616e.f19064e) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* renamed from: extends, reason: not valid java name */
    public boolean m4643extends() {
        ColorStateList colorStateList;
        return ((Shader) this.f36469e) == null && (colorStateList = (ColorStateList) this.f36471e) != null && colorStateList.isStateful();
    }

    public int firebase(Object obj) {
        return ((long[]) obj).length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r10 >= r11) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        vip(r5, r3);
        r5 = (byte[]) r8.f36471e;
        r0.update(r5, 0, r5.length);
        r0.update(r3, 0, 4);
        r0.doFinal(r1, 0);
        java.lang.System.arraycopy(r1, 0, r9, r10, r11 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r11 > r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        vip(r5, r3);
        r6 = (byte[]) r8.f36471e;
        r0.update(r6, 0, r6.length);
        r0.update(r3, 0, 4);
        r0.doFinal(r1, 0);
        java.lang.System.arraycopy(r1, 0, r9, r5 * r10, r10);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r5 < (r11 / r10)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r10 = r10 * r5;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC10630e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int generateBytes(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            int r10 = r8.f36470e
            java.lang.Object r0 = r8.f36469e
            int r1 = r9.length
            int r1 = r1 - r11
            if (r1 < 0) goto L4a
            byte[] r1 = new byte[r10]
            r2 = 4
            byte[] r3 = new byte[r2]
            r0.reset()
            r4 = 0
            r5 = r4
            if (r11 <= r10) goto L30
        L14:
            vip(r5, r3)
            java.lang.Object r6 = r8.f36471e
            byte[] r6 = (byte[]) r6
            int r7 = r6.length
            r0.update(r6, r4, r7)
            r0.update(r3, r4, r2)
            r0.doFinal(r1, r4)
            int r6 = r5 * r10
            java.lang.System.arraycopy(r1, r4, r9, r6, r10)
            int r5 = r5 + 1
            int r6 = r11 / r10
            if (r5 < r6) goto L14
        L30:
            int r10 = r10 * r5
            if (r10 >= r11) goto L49
            vip(r5, r3)
            java.lang.Object r5 = r8.f36471e
            byte[] r5 = (byte[]) r5
            int r6 = r5.length
            r0.update(r5, r4, r6)
            r0.update(r3, r4, r2)
            r0.doFinal(r1, r4)
            int r0 = r11 - r10
            java.lang.System.arraycopy(r1, r4, r9, r10, r0)
        L49:
            return r11
        L4a:
            eْٟؗ r9 = new eْٟؗ
            java.lang.String r10 = "output buffer too small"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.generateBytes(byte[], int, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x0708. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r6v53, types: [eٔ۟ٔ, java.lang.Object] */
    @Override // defpackage.InterfaceC16964e
    public Object get() {
        Object c10503e;
        Object c12701e;
        Object obj;
        int i = 2;
        boolean z = false;
        z = false;
        int i2 = 1;
        switch (this.f36472e) {
            case 7:
                C7646e c7646e = (C7646e) this.f36469e;
                C5084e c5084e = (C5084e) this.f36471e;
                int i3 = this.f36470e;
                switch (i3) {
                    case 0:
                        C6140e c6140e = c5084e.ad;
                        c6140e.getClass();
                        return new C5799e(c6140e, (C10503e) c5084e.f10919interface.get(), (InterfaceC12424e) c5084e.firebase.get(), (InterfaceC3958e) c5084e.f10918goto.get(), (C8591e) c5084e.adcel.get(), (C5241e) c5084e.inmobi.get());
                    case 1:
                        C2532e c2532e = c7646e.ad;
                        C2532e c2532e2 = c7646e.ad;
                        C9872e c9872e = (C9872e) c2532e.f6385e;
                        AbstractC1513e.appmetrica(c9872e);
                        C9576e c9576e = (C9576e) c2532e2.f6384e;
                        AbstractC1513e.appmetrica(c9576e);
                        C16911e c16911e = new C16911e(c7646e, c5084e, 15);
                        InterfaceC9550e interfaceC9550e = (InterfaceC9550e) c5084e.appmetrica.get();
                        C12528e c12528e = (C12528e) c5084e.smaato.get();
                        C16089e c16089e = new C16089e(24);
                        c16089e.metrica(c5084e.loadAd.get());
                        c16089e.metrica(c5084e.admob.get());
                        c16089e.metrica(c5084e.subscription.get());
                        c16089e.metrica(c5084e.mopub.get());
                        c16089e.metrica(c5084e.remoteconfig.get());
                        c16089e.metrica(c5084e.Signature.get());
                        c16089e.metrica(c5084e.smaato.get());
                        c16089e.metrica(c5084e.pro.get());
                        c16089e.metrica(c5084e.signatures.get());
                        ArrayList arrayList = (ArrayList) c16089e.f31681e;
                        Set singleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : DesugarCollections.unmodifiableSet(new HashSet(arrayList));
                        C9255e c9255e = (C9255e) c5084e.isVip.get();
                        C5241e c5241e = (C5241e) c5084e.inmobi.get();
                        C7850e c7850e = c5084e.isPro;
                        InterfaceC11206e interfaceC11206e = c5084e.firebase;
                        InterfaceC6744e interfaceC6744e = (InterfaceC6744e) c5084e.subs.get();
                        C13825e c13825e = (C13825e) c5084e.license.get();
                        C4373e c4373e = (C4373e) c2532e2.f6389e;
                        C6714e c6714e = (C6714e) c5084e.f10917class.get();
                        Context context = (Context) c2532e2.f6388e;
                        c10503e = new C10503e(c9872e, c9576e, c16911e, interfaceC9550e, c12528e, singleton, c9255e, c5241e, c7850e, interfaceC11206e, interfaceC6744e, c13825e, c4373e, c6714e, context, C0477e.billing.amazon(context));
                        return c10503e;
                    case 2:
                        return new C17300e((C13825e) c5084e.license.get());
                    case 3:
                        C6140e c6140e2 = c5084e.ad;
                        c6140e2.getClass();
                        return new C13825e(c6140e2, (InterfaceC2531e) c5084e.metrica.get());
                    case 4:
                        C9872e c9872e2 = (C9872e) c7646e.ad.f6385e;
                        AbstractC1513e.appmetrica(c9872e2);
                        C6140e c6140e3 = c5084e.ad;
                        c6140e3.getClass();
                        try {
                            return AbstractC17861e.license(c9872e2.vip(), c6140e3.f12912e);
                        } catch (C15895e unused) {
                            if (AbstractC9464e.amazon()) {
                                Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                                break;
                            }
                        }
                        break;
                    case 5:
                        return new C12528e((InterfaceC2531e) c5084e.metrica.get(), (C11744e) c5084e.mopub.get(), (C8591e) c5084e.adcel.get(), (C3154e) c5084e.advert.get());
                    case 6:
                        return new C11744e((C13825e) c5084e.license.get(), (AbstractC16338e.ad(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !((C1209e) c5084e.startapp.get()).ad().ad(ImageCaptureFailWithAutoFlashQuirk.class)) ? C17647e.f34589e : C15802e.f31121e, (C8591e) c5084e.adcel.get());
                    case 7:
                        return new C1209e((InterfaceC2531e) c5084e.metrica.get(), (C15436e) c5084e.yandex.get());
                    case 8:
                        return new C15436e((StreamConfigurationMap) c5084e.purchase.get(), (C3031e) c5084e.billing.get());
                    case 9:
                        InterfaceC2531e interfaceC2531e = (InterfaceC2531e) c5084e.metrica.get();
                        if (interfaceC2531e != null) {
                            return (StreamConfigurationMap) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        }
                        return null;
                    case 10:
                        InterfaceC2531e interfaceC2531e2 = (InterfaceC2531e) c5084e.metrica.get();
                        return new C3031e(interfaceC2531e2);
                    case 11:
                        C6140e c6140e4 = c5084e.ad;
                        c6140e4.getClass();
                        Executor executor = ((C7193e) c7646e.ad.f6386e).ad;
                        return new C8591e(AbstractC9743e.ad(AbstractC5797e.vip(AbstractC5097e.ad(), AbstractC18275e.purchase(executor)).mo394const(new C5621e("CXCP-UseCase-" + c6140e4.f12912e))), executor);
                    case 12:
                        return new C3154e();
                    case 13:
                        return new C12396e((C3082e) c5084e.amazon.get());
                    case 14:
                        return new C3082e((C13825e) c5084e.license.get(), (C8591e) c5084e.adcel.get(), (C3154e) c5084e.advert.get());
                    case 15:
                        c10503e = new C13583e((C13825e) c5084e.license.get(), (C11744e) c5084e.mopub.get(), (C8591e) c5084e.adcel.get(), (C17425e) c5084e.Signature.get(), ((C1209e) c5084e.startapp.get()).ad().ad(TorchFlashRequiredFor3aUpdateQuirk.class) ? C5107e.f10960e : C4524e.f9815e);
                        return c10503e;
                    case 16:
                        C13825e c13825e2 = (C13825e) c5084e.license.get();
                        C11744e c11744e = (C11744e) c5084e.mopub.get();
                        return new C17425e(c13825e2, c11744e);
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        c10503e = new C13330e((C13825e) c5084e.license.get(), ((C1209e) c5084e.startapp.get()).ad().ad(AfRegionFlipHorizontallyQuirk.class) ? C14914e.f29570e : C5438e.f11687e, (C11744e) c5084e.mopub.get(), (C8591e) c5084e.adcel.get(), c5084e.vip());
                        return c10503e;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return new C13609e((C13583e) c5084e.admob.get(), (C8591e) c5084e.adcel.get());
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        return new C12610e();
                    case 20:
                        return new C1985e(c5084e.vip());
                    case 21:
                        return new C9255e((C11074e) c5084e.tapsense.get(), (C8591e) c5084e.adcel.get(), (C3154e) c5084e.advert.get());
                    case 22:
                        return new C11074e();
                    case 23:
                        return new C5241e();
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        C13825e c13825e3 = (C13825e) c5084e.license.get();
                        C6140e c6140e5 = c5084e.ad;
                        c6140e5.getClass();
                        C5241e c5241e2 = (C5241e) c5084e.inmobi.get();
                        C3887e c3887e = (C3887e) c5084e.applovin.get();
                        C8928e c8928e = (C8928e) c5084e.ads.get();
                        C1209e c1209e = (C1209e) c5084e.startapp.get();
                        InterfaceC6744e interfaceC6744e2 = (InterfaceC6744e) c5084e.subs.get();
                        C15436e c15436e = (C15436e) c5084e.yandex.get();
                        c10503e = new C13684e(c13825e3, c6140e5, c5241e2, c3887e, c8928e, c1209e, interfaceC6744e2, c15436e);
                        return c10503e;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        C1985e c1985e = (C1985e) c5084e.signatures.get();
                        C17425e c17425e = (C17425e) c5084e.Signature.get();
                        return new C3887e(c1985e, c17425e);
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        return new C8928e();
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        return new C2801e((String) c5084e.premium.get(), ((C1209e) c5084e.startapp.get()).ad());
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        C6140e c6140e6 = c5084e.ad;
                        c6140e6.getClass();
                        String str = c6140e6.f12912e;
                        AbstractC1513e.appmetrica(str);
                        return str;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        c7646e.ad();
                        return new Object();
                    case 30:
                        C8928e c8928e2 = (C8928e) c5084e.ads.get();
                        C3154e c3154e = (C3154e) c5084e.advert.get();
                        C6140e c6140e7 = c5084e.ad;
                        c6140e7.getClass();
                        C1209e c1209e2 = (C1209e) c5084e.startapp.get();
                        InterfaceC9550e interfaceC9550e2 = (InterfaceC9550e) c5084e.appmetrica.get();
                        InterfaceC11623e ad = c5084e.ad();
                        InterfaceC2531e interfaceC2531e3 = (InterfaceC2531e) c5084e.metrica.get();
                        C2532e c2532e3 = c7646e.ad;
                        C4373e c4373e2 = (C4373e) c2532e3.f6389e;
                        C17424e c17424e = (C17424e) c2532e3.f6387e;
                        AbstractC1513e.appmetrica(c17424e);
                        c10503e = new C6714e(c8928e2, c3154e, c6140e7, c1209e2, interfaceC9550e2, ad, interfaceC2531e3, c4373e2, c17424e);
                        return c10503e;
                    case 31:
                        C13825e c13825e4 = (C13825e) c5084e.license.get();
                        return new C6198e(c13825e4, (C13583e) c5084e.admob.get(), (C13330e) c5084e.subscription.get(), (C13609e) c5084e.remoteconfig.get(), (C17425e) c5084e.Signature.get(), (C12528e) c5084e.smaato.get(), (C1985e) c5084e.signatures.get(), (InterfaceC9550e) c5084e.appmetrica.get(), (C9255e) c5084e.isVip.get(), (C10503e) c5084e.f10919interface.get(), (C8591e) c5084e.adcel.get(), (C12610e) c5084e.pro.get());
                    default:
                        throw new AssertionError(i3);
                }
            case 8:
                C17338e c17338e = (C17338e) this.f36469e;
                C14995e c14995e = (C14995e) this.f36471e;
                C2532e c2532e4 = (C2532e) c14995e.ad;
                int i4 = this.f36470e;
                switch (i4) {
                    case 0:
                        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) ((InterfaceC11206e) c14995e.metrica).get();
                        C17280e c17280e = (C17280e) c17338e.purchase.get();
                        C12204e c12204e = (C12204e) c17338e.loadAd.get();
                        C9485e c9485e = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e);
                        C9823e c9823e = (C9823e) c2532e4.f6385e;
                        AbstractC1513e.appmetrica(c9823e);
                        C14233e c14233e = (C14233e) c2532e4.f6384e;
                        AbstractC1513e.appmetrica(c14233e);
                        C14246e c14246e = (C14246e) ((InterfaceC11206e) c14995e.license).get();
                        InterfaceC17353e interfaceC17353e = (InterfaceC17353e) ((InterfaceC11206e) c14995e.adcel).get();
                        C17338e c17338e2 = (C17338e) c14995e.vip;
                        C17280e c17280e2 = (C17280e) c17338e2.purchase.get();
                        C9485e c9485e2 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e2);
                        C2107e c2107e = (C2107e) ((InterfaceC6755e) c2532e4.f6387e);
                        AbstractC1513e.appmetrica(c2107e);
                        return new C4760e(interfaceC18435e, c17280e, c12204e, c9485e, c9823e, c14233e, c14246e, interfaceC17353e, new C18464e(c17280e2, c9485e2, c2107e, (C5122e) c17338e2.Signature.get(), (C12204e) c17338e2.loadAd.get(), 29), (C15682e) c17338e.signatures.get(), (C13322e) c17338e.applovin.get(), (C5122e) c17338e.Signature.get(), (C13399e) c17338e.smaato.get(), (C13783e) c2532e4.f6388e, (C5327e) c2532e4.f6389e, AbstractC0436e.yandex(c2532e4), (C1758e) c17338e.ads.get());
                    case 1:
                        return AbstractC9743e.ad(AbstractC5797e.vip(new C6799e((InterfaceC10500e) c17338e.license.get()), AbstractC5797e.vip(((C17280e) c17338e.purchase.get()).purchase, new C5621e("CXCP-Camera2Controller"))));
                    case 2:
                        InterfaceC11206e interfaceC11206e2 = c17338e.billing;
                        C17280e c17280e3 = (C17280e) c17338e.purchase.get();
                        C9485e c9485e3 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e3);
                        return new C14246e(interfaceC11206e2, c17280e3, c9485e3.ad, (InterfaceC10500e) c17338e.license.get());
                    case 3:
                        Csuper csuper = (Csuper) c14995e.appmetrica;
                        Csuper csuper2 = (Csuper) c14995e.purchase;
                        Csuper csuper3 = (Csuper) c14995e.billing;
                        Csuper csuper4 = (Csuper) c14995e.yandex;
                        Csuper csuper5 = (Csuper) c14995e.startapp;
                        C9485e c9485e4 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e4);
                        int i5 = c9485e4.yandex;
                        if (i5 == 2) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return (InterfaceC17353e) csuper5.get();
                            }
                            throw new IllegalStateException("Cannot use Extension sessions below Android S");
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 28) {
                            return (InterfaceC17353e) csuper4.get();
                        }
                        if (i5 == 1) {
                            return (InterfaceC17353e) csuper2.get();
                        }
                        if (i6 >= 24) {
                            return (InterfaceC17353e) csuper3.get();
                        }
                        if (c9485e4.license == null) {
                            return (InterfaceC17353e) csuper.get();
                        }
                        throw new IllegalStateException("Reprocessing is not supported on Android M");
                    case 4:
                        C2107e yandex = AbstractC0436e.yandex(c2532e4);
                        C9485e c9485e5 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e5);
                        return new C5962e(yandex, c9485e5, z ? 1 : 0);
                    case 5:
                        C2107e yandex2 = AbstractC0436e.yandex(c2532e4);
                        return new C1698e(yandex2);
                    case 6:
                        C2107e yandex3 = AbstractC0436e.yandex(c2532e4);
                        C9485e c9485e6 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e6);
                        return new C5962e(yandex3, c9485e6, i2);
                    case 7:
                        C17280e c17280e4 = (C17280e) c17338e.purchase.get();
                        C9485e c9485e7 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e7);
                        return new C0712e(c17280e4, c9485e7, AbstractC0436e.yandex(c2532e4));
                    case 8:
                        C17280e c17280e5 = (C17280e) c17338e.purchase.get();
                        C9485e c9485e8 = (C9485e) c2532e4.f6386e;
                        AbstractC1513e.appmetrica(c9485e8);
                        return new C15676e(c17280e5, c9485e8, AbstractC0436e.yandex(c2532e4), (InterfaceC12541e) c17338e.amazon.get(), (C12204e) c17338e.loadAd.get());
                    default:
                        throw new AssertionError(i4);
                }
            default:
                int i7 = 3;
                switch (this.f36470e) {
                    case 0:
                        C9485e c9485e9 = (C9485e) ((C16911e) ((C18277e) this.f36471e).ad).f33137e;
                        AbstractC1513e.appmetrica(c9485e9);
                        InterfaceC2531e interfaceC2531e4 = (InterfaceC2531e) ((InterfaceC11206e) ((C18277e) this.f36471e).metrica).get();
                        C9823e c9823e2 = (C9823e) ((C7850e) ((C18277e) this.f36471e).admob).get();
                        C9823e c9823e3 = (C9823e) ((C7850e) ((C18277e) this.f36471e).admob).get();
                        C2107e c2107e2 = (C2107e) ((C7850e) ((C18277e) this.f36471e).subscription).get();
                        C14233e c14233e2 = (C14233e) ((InterfaceC11206e) ((C18277e) this.f36471e).appmetrica).get();
                        C4760e c4760e = (C4760e) ((C7850e) ((C18277e) this.f36471e).remoteconfig).get();
                        C7864e c7864e = (C7864e) ((InterfaceC11206e) ((C18277e) this.f36471e).yandex).get();
                        C5157e c5157e = (C5157e) ((InterfaceC11206e) ((C18277e) this.f36471e).purchase).get();
                        C9173e c9173e = (C9173e) ((C17338e) this.f36469e).subscription.get();
                        C18277e c18277e = (C18277e) this.f36471e;
                        c12701e = new C12701e(c9485e9, interfaceC2531e4, c9823e2, c9823e3, c2107e2, c14233e2, c4760e, c7864e, c5157e, c9173e, (C13783e) ((C16911e) c18277e.ad).f33136e, (C9003e) ((InterfaceC11206e) c18277e.advert).get(), (C2866e) ((InterfaceC11206e) ((C18277e) this.f36471e).smaato).get(), (C12714e) ((InterfaceC11206e) ((C18277e) this.f36471e).adcel).get(), (InterfaceC18435e) ((InterfaceC11206e) ((C18277e) this.f36471e).mopub).get(), (C11087e) ((InterfaceC11206e) ((C18277e) this.f36471e).loadAd).get());
                        return c12701e;
                    case 1:
                        C9485e c9485e10 = (C9485e) ((C16911e) ((C18277e) this.f36471e).ad).f33137e;
                        AbstractC1513e.appmetrica(c9485e10);
                        return ((C5327e) ((InterfaceC0707e) ((InterfaceC11206e) ((C18277e) this.f36471e).vip).get())).metrica.appmetrica(c9485e10.ad);
                    case 2:
                        C13738e c13738e = (C13738e) ((C17338e) this.f36469e).isVip.get();
                        AbstractC1513e.appmetrica((C9485e) ((C16911e) ((C18277e) this.f36471e).ad).f33137e);
                        InterfaceC0707e interfaceC0707e = c13738e.license;
                        AbstractC1513e.appmetrica(interfaceC0707e);
                        return interfaceC0707e;
                    case 3:
                        C17280e c17280e6 = (C17280e) ((C17338e) this.f36469e).purchase.get();
                        C16911e c16911e2 = (C16911e) ((C18277e) this.f36471e).ad;
                        C13783e c13783e = (C13783e) c16911e2.f33136e;
                        C9485e c9485e11 = (C9485e) c16911e2.f33137e;
                        AbstractC1513e.appmetrica(c9485e11);
                        c12701e = new C9823e(c17280e6, c13783e, c9485e11, (C16354e) ((InterfaceC11206e) ((C18277e) this.f36471e).license).get(), (List) ((InterfaceC11206e) ((C18277e) this.f36471e).startapp).get(), (C5122e) ((C17338e) this.f36469e).Signature.get());
                        return c12701e;
                    case 4:
                        return new C16354e();
                    case 5:
                        C9485e c9485e12 = (C9485e) ((C16911e) ((C18277e) this.f36471e).ad).f33137e;
                        AbstractC1513e.appmetrica(c9485e12);
                        C16354e c16354e = (C16354e) ((InterfaceC11206e) ((C18277e) this.f36471e).license).get();
                        C7864e c7864e2 = (C7864e) ((InterfaceC11206e) ((C18277e) this.f36471e).yandex).get();
                        ArrayList mopub = AbstractC6874e.mopub(c16354e);
                        mopub.add(c16354e);
                        mopub.add(c7864e2);
                        mopub.addAll(c9485e12.mopub);
                        obj = mopub;
                        return obj;
                    case 6:
                        C2107e c2107e3 = (C2107e) ((C7850e) ((C18277e) this.f36471e).subscription).get();
                        C5157e c5157e2 = (C5157e) ((InterfaceC11206e) ((C18277e) this.f36471e).purchase).get();
                        InterfaceC2531e interfaceC2531e5 = (InterfaceC2531e) ((InterfaceC11206e) ((C18277e) this.f36471e).metrica).get();
                        C5364e c5364e = (C5364e) ((InterfaceC11206e) ((C18277e) this.f36471e).billing).get();
                        Integer num = (Integer) ((C9000e) interfaceC2531e5).metrica(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
                        if (num != null && num.intValue() == 1) {
                            z = true;
                        }
                        long j = c5364e.ad;
                        return new C7864e(c2107e3, c5157e2, z);
                    case 7:
                        InterfaceC2531e interfaceC2531e6 = (InterfaceC2531e) ((InterfaceC11206e) ((C18277e) this.f36471e).metrica).get();
                        C9485e c9485e13 = (C9485e) ((C16911e) ((C18277e) this.f36471e).ad).f33137e;
                        AbstractC1513e.appmetrica(c9485e13);
                        C14595e c14595e = new C14595e(i);
                        Object obj2 = ((C18277e) this.f36471e).remoteconfig;
                        return new C2107e(interfaceC2531e6, c9485e13, c14595e);
                    case 8:
                        C16911e c16911e3 = (C16911e) ((C18277e) this.f36471e).ad;
                        C13783e c13783e2 = (C13783e) c16911e3.f33136e;
                        C9485e c9485e14 = (C9485e) c16911e3.f33137e;
                        AbstractC1513e.appmetrica(c9485e14);
                        InterfaceC0707e interfaceC0707e2 = (InterfaceC0707e) ((InterfaceC11206e) ((C18277e) this.f36471e).vip).get();
                        C9823e c9823e4 = (C9823e) ((C7850e) ((C18277e) this.f36471e).admob).get();
                        InterfaceC6755e interfaceC6755e = (InterfaceC6755e) ((C7850e) ((C18277e) this.f36471e).subscription).get();
                        C14233e c14233e3 = (C14233e) ((InterfaceC11206e) ((C18277e) this.f36471e).appmetrica).get();
                        C5327e c5327e = (C5327e) interfaceC0707e2;
                        C9770e c9770e = c5327e.appmetrica;
                        C2532e c2532e5 = new C2532e(c13783e2, c9485e14, c9823e4, (C2107e) interfaceC6755e, c14233e3, c5327e);
                        C17338e c17338e3 = (C17338e) c9770e.f19315e;
                        ?? obj3 = new Object();
                        obj3.vip = c17338e3;
                        obj3.ad = c2532e5;
                        int i8 = 8;
                        obj3.metrica = C6554e.ad(new Csuper(c17338e3, (Object) obj3, i2, i8));
                        obj3.license = C6554e.ad(new Csuper(c17338e3, (Object) obj3, i, i8));
                        obj3.appmetrica = new Csuper(c17338e3, (Object) obj3, 4, i8);
                        obj3.purchase = new Csuper(c17338e3, (Object) obj3, 5, i8);
                        obj3.billing = new Csuper(c17338e3, (Object) obj3, 6, i8);
                        obj3.yandex = new Csuper(c17338e3, (Object) obj3, 7, i8);
                        obj3.startapp = new Csuper(c17338e3, (Object) obj3, i8, i8);
                        obj3.adcel = C6554e.ad(new Csuper(c17338e3, (Object) obj3, i7, i8));
                        obj3.mopub = C6554e.ad(new Csuper(c17338e3, (Object) obj3, z ? 1 : 0, i8));
                        C4760e c4760e2 = (C4760e) ((InterfaceC11206e) obj3.mopub).get();
                        synchronized (c5327e.purchase) {
                            c5327e.billing.add(c4760e2);
                        }
                        AbstractC1513e.appmetrica(c4760e2);
                        return c4760e2;
                    case 9:
                        C2107e c2107e4 = (C2107e) ((C7850e) ((C18277e) this.f36471e).subscription).get();
                        obj = new C14233e(c2107e4, (C7850e) ((C18277e) this.f36471e).remoteconfig, (C13322e) ((C17338e) this.f36469e).applovin.get(), c2107e4.f5443e);
                        return obj;
                    case 10:
                        return new C5157e();
                    case 11:
                        long j2 = Long.MAX_VALUE;
                        long j3 = Long.MAX_VALUE;
                        for (int i9 = 0; i9 < 3; i9++) {
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                            if (elapsedRealtimeNanos2 < j3) {
                                j3 = elapsedRealtimeNanos2;
                            }
                        }
                        long j4 = 0;
                        for (int i10 = 0; i10 < 3; i10++) {
                            long nanoTime = System.nanoTime();
                            long elapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                            long nanoTime2 = System.nanoTime();
                            long j5 = nanoTime2 - nanoTime;
                            if (j5 < j2) {
                                j4 = elapsedRealtimeNanos3 - ((nanoTime + nanoTime2) / 2);
                                j2 = j5;
                            }
                        }
                        return new C5364e(j4);
                    case 12:
                        C9823e c9823e5 = (C9823e) ((C7850e) ((C18277e) this.f36471e).admob).get();
                        return new C9003e(c9823e5);
                    case 13:
                        return new C12714e();
                    case 14:
                        return AbstractC9743e.ad(AbstractC5797e.vip(new C6799e((InterfaceC10500e) ((C17338e) this.f36469e).license.get()), AbstractC5797e.vip(((C17280e) ((C17338e) this.f36469e).purchase.get()).purchase, new C5621e("CXCP-Graph"))));
                    case 15:
                        return new C2866e();
                    case 16:
                        return new C11087e((C9823e) ((C7850e) ((C18277e) this.f36471e).admob).get(), (InterfaceC2531e) ((InterfaceC11206e) ((C18277e) this.f36471e).metrica).get(), (C13585e) ((InterfaceC11206e) ((C18277e) this.f36471e).amazon).get(), (C16354e) ((InterfaceC11206e) ((C18277e) this.f36471e).license).get());
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return new C13585e();
                    default:
                        throw new AssertionError(this.f36470e);
                }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[][], java.io.Serializable] */
    /* renamed from: goto, reason: not valid java name */
    public subs m4644goto(int i) {
        ?? r0 = (byte[][]) this.f36471e;
        int i2 = this.f36470e;
        AbstractC9907e abstractC9907e = (AbstractC9907e) this.f36469e;
        if (abstractC9907e instanceof C3704e) {
            C3704e c3704e = (C3704e) abstractC9907e;
            c3704e.f8292e = false;
            c3704e.license();
        }
        int isVip = Cgoto.isVip(abstractC9907e, i);
        int loadAd = Cgoto.loadAd(abstractC9907e, i2, isVip == 3 || isVip == 4 || isVip == 16 || isVip == 17 || isVip == 8);
        if (loadAd < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            Csuper csuper = new Csuper(new C3704e(abstractC9907e, i2), i2, (Serializable) r0, 0);
            int i3 = i & 192;
            if (i3 != 0) {
                return new C10210e(i3, isVip, csuper);
            }
            if (isVip == 3) {
                return new C15936e(csuper);
            }
            if (isVip == 4) {
                return new C0634e(csuper);
            }
            if (isVip == 8) {
                return new C6525e(csuper);
            }
            if (isVip == 16) {
                C6525e c6525e = new C6525e(0);
                c6525e.f13444e = csuper;
                return c6525e;
            }
            if (isVip == 17) {
                C6525e c6525e2 = new C6525e(1);
                c6525e2.f13444e = csuper;
                return c6525e2;
            }
            throw new Cclass("unknown BER object encountered: 0x" + Integer.toHexString(isVip));
        }
        C9482e c9482e = new C9482e(abstractC9907e, loadAd, i2);
        if ((i & 224) == 0) {
            if (isVip == 3) {
                return new C3732e(c9482e);
            }
            if (isVip == 4) {
                C0634e c0634e = new C0634e();
                c0634e.f2861e = c9482e;
                return c0634e;
            }
            if (isVip == 8) {
                throw new Cclass("externals must use constructed encoding (see X.690 8.18)");
            }
            if (isVip == 16) {
                throw new Cclass("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (isVip == 17) {
                throw new Cclass("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return Cgoto.license(isVip, c9482e, r0);
            } catch (IllegalArgumentException e) {
                throw new Cclass("corrupted stream detected", e, 0);
            }
        }
        Csuper csuper2 = new Csuper(c9482e, c9482e.f19544e, (Serializable) r0, 0);
        int i4 = i & 192;
        if (i4 != 0) {
            return new C10050e(i4, isVip, (i & 32) != 0, csuper2);
        }
        if (isVip == 3) {
            return new C15936e(csuper2);
        }
        if (isVip == 4) {
            return new C0634e(csuper2);
        }
        if (isVip == 8) {
            return new C6525e(csuper2);
        }
        if (isVip == 16) {
            C6525e c6525e3 = new C6525e(3);
            c6525e3.f13444e = csuper2;
            return c6525e3;
        }
        if (isVip == 17) {
            C6525e c6525e4 = new C6525e(4);
            c6525e4.f13444e = csuper2;
            return c6525e4;
        }
        throw new Cclass("unknown DL object encountered: 0x" + Integer.toHexString(isVip));
    }

    /* renamed from: implements */
    public Csuper mo3904implements(Object obj, Object obj2) {
        int i = (this.f36470e + 1) * 2;
        Object[] objArr = (Object[]) this.f36469e;
        if (i > objArr.length) {
            this.f36469e = Arrays.copyOf(objArr, AbstractC13584e.vip(objArr.length, i));
        }
        AbstractC17595e.vip(obj, obj2);
        Object[] objArr2 = (Object[]) this.f36469e;
        int i2 = this.f36470e;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f36470e = i2 + 1;
        return this;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|(2:14|15)(2:17|18))(2:19|20))(2:21|(5:23|24|25|(1:27)|28)(2:29|30)))(2:31|32))(6:56|57|58|(4:60|61|62|63)(4:70|71|72|73)|64|(2:66|42)(1:67))|33|34|(6:36|37|38|39|(1:41)|(0)(0))(2:45|(4:47|48|49|50)(2:54|55))|42))|80|6|7|(0)(0)|33|34|(0)(0)|42) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r2 == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        r2 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
    
        r2 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* renamed from: import, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m4645import(defpackage.C12503e r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.m4645import(eّٕۥ, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC10630e
    public void init(InterfaceC13829e interfaceC13829e) {
        if (!(interfaceC13829e instanceof C11579e)) {
            throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
        }
        this.f36471e = ((C11579e) interfaceC13829e).ad;
    }

    public Object inmobi(int i) {
        SparseArray sparseArray = (SparseArray) this.f36469e;
        if (this.f36470e == -1) {
            this.f36470e = 0;
        }
        while (true) {
            int i2 = this.f36470e;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f36470e--;
        }
        while (this.f36470e < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f36470e + 1)) {
            this.f36470e++;
        }
        return sparseArray.valueAt(this.f36470e);
    }

    /* renamed from: instanceof, reason: not valid java name */
    public void m4646instanceof(Object obj, Object obj2) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj3 = ((Object[]) this.f36469e)[i];
            if (obj3 != null) {
                if (i2 < i) {
                    int i4 = i - i2;
                    System.arraycopy(obj, i2, obj2, i3, i4);
                    i3 += i4;
                }
                int firebase = firebase(obj3);
                System.arraycopy(obj3, 0, obj2, i3, firebase);
                i3 += firebase;
                i2 = i + 1;
            }
            if (i == 1) {
                break;
            } else {
                i++;
            }
        }
        if (i2 < 2) {
            System.arraycopy(obj, i2, obj2, i3, 2 - i2);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public boolean m4647interface(Object obj) {
        C10861e c10861e = (C10861e) this.f36471e;
        return ((((Number) ((C13506e) this.f36469e).get(obj)).intValue() >>> c10861e.ad) & ((1 << c10861e.vip) - 1)) == c10861e.metrica;
    }

    public int[] isPro(int i) {
        C12718e c12718e = (C12718e) this.f36471e;
        C13481e c13481e = (C13481e) AbstractC13480e.m3592native(m4639private(i, c12718e), c12718e);
        if (c13481e != null) {
            return c13481e.vip;
        }
        return null;
    }

    @Override // defpackage.InterfaceC4777e
    public void isVip() {
        switch (this.f36472e) {
            case 11:
                return;
            default:
                C1292e c1292e = (C1292e) this.f36471e;
                byte[] bArr = AbstractC9413e.vip;
                c1292e.getClass();
                c1292e.m570throw(bArr.length, bArr);
                return;
        }
    }

    @Override // defpackage.InterfaceC14309e
    public void license(Object obj) {
        List list = (List) obj;
        C6584e c6584e = ((C5537e) this.f36471e).yandex;
        Handler handler = c6584e.advert;
        C18424e c18424e = (C18424e) this.f36469e;
        AbstractC9413e.m2565strictfp(handler, new RunnableC7410e(c6584e, c18424e, new RunnableC1459e(this.f36470e, 3, this, list, c18424e)));
    }

    public void loadAd(InterfaceC8427e interfaceC8427e) {
        Iterator it = ((CopyOnWriteArrayList) this.f36471e).iterator();
        while (it.hasNext()) {
            C7851e c7851e = (C7851e) it.next();
            AbstractC9413e.m2565strictfp(c7851e.ad, new RunnableC7410e(interfaceC8427e, c7851e.vip, 24));
        }
    }

    public synchronized void metrica(BigInteger bigInteger) {
        ((WeakHashMap) this.f36469e).put(bigInteger, Boolean.TRUE);
        BigInteger[] bigIntegerArr = (BigInteger[]) this.f36471e;
        int i = this.f36470e;
        bigIntegerArr[i] = bigInteger;
        this.f36470e = (i + 1) % bigIntegerArr.length;
    }

    public C0409e mopub(boolean z) {
        C14170e c14170e;
        C14170e c14170e2;
        if (z && (c14170e2 = (C14170e) this.f36471e) != null) {
            throw c14170e2.ad();
        }
        C0409e yandex = C0409e.yandex(this.f36470e, (Object[]) this.f36469e, this);
        if (!z || (c14170e = (C14170e) this.f36471e) == null) {
            return yandex;
        }
        throw c14170e.ad();
    }

    /* renamed from: new, reason: not valid java name */
    public void m4648new() {
        AbstractC1660e.tapsense(0, 0, 6, (int[]) this.f36469e);
        ((C12718e) this.f36471e).clear();
    }

    /* renamed from: package, reason: not valid java name */
    public void m4649package(int i, int i2) {
        if (!(i >= 0)) {
            AbstractC8889e.ad("Negative lanes are not supported");
        }
        subscription(i);
        ((int[]) this.f36469e)[i - this.f36470e] = i2 + 1;
    }

    public Object premium(int i) {
        Object[] objArr = (Object[]) this.f36471e;
        int i2 = i - this.f36470e;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public int pro(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!startapp(i, i2));
        return i;
    }

    /* renamed from: protected, reason: not valid java name */
    public void m4650protected(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f36469e;
        Context context = imageView.getContext();
        int[] iArr = AbstractC6062e.purchase;
        C0912e advert = C0912e.advert(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) advert.f3331e;
        AbstractC2016e.amazon(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) advert.f3331e, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC4628e.purchase(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC13982e.ad(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(advert.purchase(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC13982e.metrica(typedArray.getInt(3, -1), null));
            }
            advert.amazon();
        } catch (Throwable th) {
            advert.amazon();
            throw th;
        }
    }

    public void purchase(Object obj) {
        Object[] objArr = (Object[]) this.f36469e;
        int i = this.f36470e;
        this.f36470e = i + 1;
        objArr[i] = obj;
    }

    public long remoteconfig(InterfaceC2283e interfaceC2283e) {
        int appmetrica;
        C14829e c14829e = (C14829e) this.f36471e;
        C15008e c15008e = (C15008e) this.f36469e;
        while (interfaceC2283e.yandex() < interfaceC2283e.getLength() - 6) {
            int i = this.f36470e;
            long yandex = interfaceC2283e.yandex();
            C1292e c1292e = new C1292e(17);
            int i2 = 0;
            boolean license = false;
            interfaceC2283e.ad(0, 2, c1292e.ad);
            if (c1292e.billing(0, ByteOrder.BIG_ENDIAN) != i) {
                interfaceC2283e.smaato();
                interfaceC2283e.startapp((int) (yandex - interfaceC2283e.getPosition()));
            } else {
                byte[] bArr = c1292e.ad;
                while (i2 < 15 && (appmetrica = interfaceC2283e.appmetrica(2 + i2, 15 - i2, bArr)) != -1) {
                    i2 += appmetrica;
                }
                c1292e.m572while(i2 + 2);
                interfaceC2283e.smaato();
                interfaceC2283e.startapp((int) (yandex - interfaceC2283e.getPosition()));
                license = AbstractC1328e.license(c1292e, c15008e, i, c14829e);
            }
            if (license) {
                break;
            }
            interfaceC2283e.startapp(1);
        }
        if (interfaceC2283e.yandex() < interfaceC2283e.getLength() - 6) {
            return c14829e.f29362e;
        }
        interfaceC2283e.startapp((int) (interfaceC2283e.getLength() - interfaceC2283e.yandex()));
        return c15008e.adcel;
    }

    /* renamed from: return, reason: not valid java name */
    public void m4651return(int i, Function4 function4) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f36469e;
        int i3 = this.f36470e;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                function4.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|(2:14|15)(2:17|18))(2:19|20))(2:21|(5:23|24|25|(1:27)|28)(2:29|30)))(2:31|32))(6:56|57|58|(4:60|61|62|63)(4:70|71|72|73)|64|(2:66|42)(1:67))|33|34|(6:36|37|38|39|(1:41)|(0)(0))(2:45|(4:47|48|49|50)(2:54|55))|42))|80|6|7|(0)(0)|33|34|(0)(0)|42) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r2 == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        r2 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
    
        r2 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:14:0x011b, B:15:0x0122, B:17:0x0123, B:18:0x0138, B:21:0x0048, B:23:0x00e8, B:29:0x00eb, B:30:0x00f2, B:34:0x00bc, B:36:0x00c8, B:39:0x00d6, B:45:0x00f3, B:47:0x00fb, B:50:0x0109, B:54:0x0139, B:55:0x0150), top: B:7:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable signatures(defpackage.C10209e r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Csuper.signatures(eَِۚ, eُؑ۠):java.io.Serializable");
    }

    public AbstractC8507e smaato() {
        return mopub(true);
    }

    public boolean startapp(int i, int i2) {
        int subs = subs(i);
        return subs == i2 || subs == -1 || subs == -2;
    }

    /* renamed from: static, reason: not valid java name */
    public void m4652static(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f36469e;
        int i3 = this.f36470e;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = z ? 1L : 0L;
                jArr[i5] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j2);
                return;
            }
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void m4653strictfp() {
        int i = this.f36470e * 2;
        this.f36469e = Arrays.copyOf((Object[]) this.f36469e, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC1660e.Signature(0, 0, (int[]) this.f36471e, iArr, 14);
        this.f36471e = iArr;
    }

    public int subs(int i) {
        int i2 = this.f36470e;
        if (i < i2) {
            return -1;
        }
        if (i >= ((int[]) this.f36469e).length + i2) {
            return -1;
        }
        return r1[i - i2] - 1;
    }

    public void subscription(int i) {
        C12718e c12718e = (C12718e) this.f36471e;
        int i2 = this.f36470e;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int max = Math.max(i - (((int[]) this.f36469e).length / 2), 0);
            this.f36470e = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                int[] iArr = (int[]) this.f36469e;
                if (i4 < iArr.length) {
                    AbstractC1660e.advert(0, i4, iArr, iArr, iArr.length);
                }
                int[] iArr2 = (int[]) this.f36469e;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.f36469e).length, 0);
            } else {
                int i5 = -i4;
                int[] iArr3 = (int[]) this.f36469e;
                if (iArr3.length + i5 < 131072) {
                    admob(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        AbstractC1660e.advert(i5, 0, iArr3, iArr3, iArr3.length - i5);
                    }
                    int[] iArr4 = (int[]) this.f36469e;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i5), 0);
                }
            }
        } else {
            admob(i3 + 1, 0);
        }
        while (!c12718e.isEmpty() && ((C13481e) c12718e.first()).ad < this.f36470e) {
            c12718e.removeFirst();
        }
        while (!c12718e.isEmpty() && ((C13481e) c12718e.last()).ad > this.f36470e + ((int[]) this.f36469e).length) {
            c12718e.removeLast();
        }
    }

    /* renamed from: super, reason: not valid java name */
    public crashlytics m4654super() {
        AbstractC9907e abstractC9907e = (AbstractC9907e) this.f36469e;
        int read = abstractC9907e.read();
        if (read < 0) {
            return new crashlytics(0, 0);
        }
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        do {
            subs m4644goto = m4644goto(read);
            crashlyticsVar.appmetrica(m4644goto instanceof InterfaceC5145e ? ((InterfaceC5145e) m4644goto).advert() : m4644goto.billing());
            read = abstractC9907e.read();
        } while (read >= 0);
        return crashlyticsVar;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m4655synchronized(int i, long j, int i2) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f36469e;
        long[] jArr2 = (long[]) this.f36471e;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.f36470e : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                    jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (AbstractC15043e.vip & j3) | (((i7 + 3) & i3) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public C4763e tapsense(int i) {
        if (i < 0 || i >= this.f36470e) {
            StringBuilder premium = AbstractC4653e.premium("Index ", i, ", size ");
            premium.append(this.f36470e);
            AbstractC8889e.appmetrica(premium.toString());
        }
        C4763e c4763e = (C4763e) this.f36471e;
        if (c4763e != null) {
            int i2 = c4763e.ad;
            if (i < c4763e.vip + i2 && i2 <= i) {
                return c4763e;
            }
        }
        C12431e c12431e = (C12431e) this.f36469e;
        C4763e c4763e2 = (C4763e) c12431e.f24870e[AbstractC18489e.startapp(i, c12431e)];
        this.f36471e = c4763e2;
        return c4763e2;
    }

    /* renamed from: this, reason: not valid java name */
    public void m4656this(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f36469e;
        int i8 = this.f36470e;
        int i9 = i8 + 3;
        this.f36470e = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = Math.max(length * 2, i9);
            this.f36469e = Arrays.copyOf(jArr, max);
            this.f36471e = Arrays.copyOf((long[]) this.f36471e, max);
        }
        long[] jArr2 = (long[]) this.f36469e;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (1 << 60) | (Math.min(0, 1023) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (j & AbstractC15043e.ad) | (Math.min((i8 - i11) / 3, 1023) << 50);
                return;
            }
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public void m4657throw(C6913e c6913e, int i, int i2, C16975e c16975e, int i3, Object obj, long j, long j2) {
        loadAd(new C18156e(this, c6913e, new C0807e(i, i2, c16975e, i3, obj, AbstractC9413e.m2567switch(j), AbstractC9413e.m2567switch(j2)), 1));
    }

    public String toString() {
        switch (this.f36472e) {
            case 14:
                return crashlytics();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((String) this.f36469e) + "\t" + this.f36470e;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                StringBuilder sb = new StringBuilder();
                if (((EnumC12473e) this.f36469e) == EnumC12473e.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f36470e);
                sb.append(' ');
                sb.append((String) this.f36471e);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public int m4658transient() {
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = ((Object[]) this.f36469e)[i2];
            i += obj != null ? firebase(obj) : 1;
            if (i2 == 1) {
                return i;
            }
            i2++;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m4659try(C6913e c6913e, int i, int i2, C16975e c16975e, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        loadAd(new C7052e(this, c6913e, new C0807e(i, i2, c16975e, i3, obj, AbstractC9413e.m2567switch(j), AbstractC9413e.m2567switch(j2)), iOException, z));
    }

    /* renamed from: while, reason: not valid java name */
    public void m4660while(C6913e c6913e, int i, int i2, C16975e c16975e, int i3, Object obj, long j, long j2) {
        loadAd(new C18156e(this, c6913e, new C0807e(i, i2, c16975e, i3, obj, AbstractC9413e.m2567switch(j), AbstractC9413e.m2567switch(j2)), 0));
    }

    @Override // defpackage.InterfaceC14309e
    public void yandex(Throwable th) {
    }
}
