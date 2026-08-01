package defpackage;

import android.content.Context;
import android.media.Image;
import android.media.MediaCodec;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13935e implements InterfaceC15935e, InterfaceC18242e, InterfaceC14168e, InterfaceC17490e, InterfaceC12217e, InterfaceC2295e, InterfaceC10540e, InterfaceC10459e, InterfaceC15813e, InterfaceC11483e, InterfaceC13049e, InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static volatile C13935e f27640e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f27641e;

    public C13935e(int i) {
        switch (i) {
            case 1:
                this.f27641e = new byte[32];
                return;
            case 4:
                this.f27641e = new C9684e(this);
                return;
            case 5:
                this.f27641e = C4069e.license();
                return;
            case 7:
                this.f27641e = AbstractC12751e.ad();
                return;
            case 9:
                if (Build.VERSION.SDK_INT >= 35) {
                    this.f27641e = new Object();
                    return;
                } else {
                    this.f27641e = new C12894e(13, false);
                    return;
                }
            case 15:
                this.f27641e = new LinkedHashMap();
                return;
            case 20:
                this.f27641e = new ArrayList(32);
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f27641e = new ByteArrayOutputStream();
                return;
            default:
                this.f27641e = new CopyOnWriteArrayList();
                return;
        }
    }

    public C13935e(C13935e c13935e) {
        byte[] bArr = new byte[32];
        this.f27641e = bArr;
        byte[] bArr2 = (byte[]) c13935e.f27641e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    public /* synthetic */ C13935e(Object obj) {
        this.f27641e = obj;
    }

    /* renamed from: catch, reason: not valid java name */
    public static /* synthetic */ List m3729catch(C13935e c13935e, CharSequence charSequence, int i, int i2, Function2 function2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return c13935e.m3730case(charSequence, i, i2, (i3 & 8) == 0, function2);
    }

    public static int[] inmobi(int i, int i2, byte[] bArr) {
        int[] iArr = new int[i2];
        BigInteger bigInteger = BigInteger.ZERO;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            while (i4 < i) {
                bigInteger = bigInteger.shiftLeft(8).add(BigInteger.valueOf(bArr[i3] & 255));
                i3++;
                i4 += 8;
            }
            i4 -= i;
            iArr[i5] = bigInteger.shiftRight(i4).mod(BigInteger.valueOf(2L).pow(i)).intValue();
        }
        return iArr;
    }

    @Override // defpackage.InterfaceC17490e
    public void Signature(C6408e c6408e, Context context, Looper looper, Looper looper2, C17381e c17381e) {
        ((InterfaceC17490e) this.f27641e).Signature(c6408e, context, looper, looper2, c17381e);
    }

    /* renamed from: abstract */
    public void mo406abstract(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        m3734final("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
    }

    @Override // defpackage.InterfaceC11483e
    public void ad(Bundle bundle) {
        ((MediaCodec) this.f27641e).setParameters(bundle);
    }

    @Override // defpackage.InterfaceC15935e
    public int adcel() {
        return ((Image.Plane) this.f27641e).getRowStride();
    }

    @Override // defpackage.InterfaceC14168e
    public Object admob(InterfaceC1719e interfaceC1719e, Float f, Float f2, Function1 function1, C11067e c11067e) {
        Object ad = AbstractC2650e.ad(interfaceC1719e, f.floatValue(), AbstractC1284e.ad(0.0f, f2.floatValue(), 28), (C15217e) this.f27641e, function1, c11067e);
        return ad == EnumC2821e.f6782e ? ad : (C5768e) ad;
    }

    public void ads() {
        ((ArrayList) this.f27641e).add(C11621e.metrica);
    }

    @Override // defpackage.InterfaceC17490e
    public boolean advert() {
        return ((InterfaceC17490e) this.f27641e).advert();
    }

    @Override // defpackage.InterfaceC15813e
    public void amazon(C0520e c0520e, Object obj) {
        C4756e c4756e = (C4756e) this.f27641e;
        String vip = c0520e.vip();
        if ("version".equals(vip)) {
            if (obj instanceof int[]) {
                c4756e.f10184e = (int[]) obj;
            }
        } else if ("multifileClassName".equals(vip)) {
            c4756e.f10181e = obj instanceof String ? (String) obj : null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؔؕ, eِؒؖ] */
    public C11456e applovin() {
        return new C2362e(7, C17015e.vip((C4069e) this.f27641e));
    }

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public C17424e mo3419appmetrica() {
        C0445e c0445e = new C0445e((SecureRandom) this.f27641e);
        return new C17424e(c0445e.ad(), c0445e, false, 5);
    }

    @Override // defpackage.InterfaceC17490e
    public void billing() {
        ((InterfaceC17490e) this.f27641e).billing();
    }

    /* renamed from: break */
    public void mo407break(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        m3734final("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    /* renamed from: case, reason: not valid java name */
    public List m3730case(CharSequence charSequence, int i, int i2, boolean z, Function2 function2) {
        if (charSequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        C13728e c13728e = (C13728e) this.f27641e;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (((Boolean) function2.invoke(Character.valueOf(charAt), Integer.valueOf(charAt))).booleanValue()) {
                break;
            }
            C13728e[] c13728eArr = c13728e.license;
            C13728e c13728e2 = c13728eArr[charAt];
            if (c13728e2 == null) {
                c13728e = z ? c13728eArr[Character.toLowerCase(charAt)] : null;
                if (c13728e == null) {
                    return C13664e.f27089e;
                }
            } else {
                c13728e = c13728e2;
            }
            i++;
        }
        return c13728e.vip;
    }

    /* renamed from: class, reason: not valid java name */
    public void m3731class(InterfaceC12330e interfaceC12330e) {
        for (C14326e c14326e : interfaceC12330e.admob()) {
            ((C4069e) this.f27641e).billing(c14326e, interfaceC12330e.mo810catch(c14326e), interfaceC12330e.subscription(c14326e));
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void crashlytics(C0520e c0520e, C11709e c11709e, C0520e c0520e2) {
    }

    /* renamed from: default */
    public void mo408default(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        m3734final("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    /* renamed from: else, reason: not valid java name */
    public void m3732else(int i, Object obj, InterfaceC3028e interfaceC3028e) {
        AbstractC16754e abstractC16754e = (AbstractC16754e) this.f27641e;
        abstractC16754e.isPro(i, 3);
        interfaceC3028e.purchase((AbstractC6866e) obj, abstractC16754e.vip);
        abstractC16754e.isPro(i, 4);
    }

    /* renamed from: extends, reason: not valid java name */
    public void m3733extends(float f, float f2) {
        ((ArrayList) this.f27641e).add(new C8664e(f, f2));
    }

    /* renamed from: final, reason: not valid java name */
    public void m3734final(String str, Bundle bundle) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        ((MediaController.TransportControls) this.f27641e).sendCustomAction(str, bundle);
    }

    public void firebase(float f) {
        ((ArrayList) this.f27641e).add(new C14810e(f));
    }

    @Override // defpackage.InterfaceC11483e
    public void flush() {
    }

    @Override // defpackage.InterfaceC13049e
    public InterfaceC3454e get(int i) {
        return (InterfaceC3454e) this.f27641e;
    }

    @Override // defpackage.InterfaceC10540e
    public EnumC10668e getState() {
        return (EnumC10668e) ((C11898e) this.f27641e).f23835e;
    }

    @Override // defpackage.InterfaceC15813e
    /* renamed from: goto */
    public InterfaceC15813e mo2367goto(C11709e c11709e, C0520e c0520e) {
        return null;
    }

    /* renamed from: implements, reason: not valid java name */
    public void m3735implements(float f, float f2, float f3, float f4) {
        ((ArrayList) this.f27641e).add(new C9777e(f, f2, f3, f4));
    }

    /* renamed from: import, reason: not valid java name */
    public void m3736import(int i) {
        byte[] bArr = (byte[]) this.f27641e;
        AbstractC3628e.billing(i, 16, bArr);
        Arrays.fill(bArr, 20, bArr.length, (byte) 0);
    }

    /* renamed from: instanceof, reason: not valid java name */
    public C11883e[] m3737instanceof(C13935e c13935e, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C13935e c13935e2;
        int i;
        int i2;
        byte[] bArr4;
        byte[] bArr5 = bArr2;
        C13935e c13935e3 = c13935e;
        C13935e c13935e4 = new C13935e(c13935e3);
        AbstractC7629e abstractC7629e = (AbstractC7629e) this.f27641e;
        int i3 = abstractC7629e.billing;
        int i4 = abstractC7629e.yandex;
        int[] inmobi = inmobi(i3, i4, bArr);
        C11883e[] c11883eArr = new C11883e[i4];
        int i5 = 0;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = inmobi[i6];
            c13935e4.m3736import(6);
            c13935e4.m3745super(c13935e3.subs());
            c13935e4.m3740package(i5);
            c13935e4.m3749transient((i6 << i3) + i7);
            byte[] license = abstractC7629e.license(c13935e4, bArr3, bArr5);
            AbstractC3628e.billing(3, 16, (byte[]) c13935e4.f27641e);
            byte[][] bArr6 = new byte[i3];
            int i8 = 0;
            while (i8 < i3) {
                int i9 = (i6 << i3) + (((i7 >>> i8) ^ 1) << i8);
                if (((i9 >>> i8) << i8) != i9) {
                    bArr4 = null;
                    c13935e2 = c13935e4;
                    i = i3;
                    i2 = i4;
                } else {
                    LinkedList linkedList = new LinkedList();
                    C13935e c13935e5 = new C13935e(c13935e4);
                    c13935e2 = c13935e4;
                    i = i3;
                    int i10 = 0;
                    while (i10 < (1 << i8)) {
                        c13935e5.m3736import(6);
                        c13935e5.m3745super(c13935e2.subs());
                        c13935e5.m3740package(0);
                        int i11 = i9 + i10;
                        c13935e5.m3749transient(i11);
                        int i12 = i10;
                        byte[] license2 = abstractC7629e.license(c13935e5, bArr3, bArr5);
                        int i13 = i11;
                        int i14 = i4;
                        AbstractC3628e.billing(3, 16, (byte[]) c13935e5.f27641e);
                        byte[] ad = abstractC7629e.ad(c13935e5, bArr3, license2);
                        int i15 = 1;
                        c13935e5.m3740package(1);
                        while (!linkedList.isEmpty() && ((C17078e) linkedList.get(0)).vip == i15) {
                            int i16 = (i13 - 1) / 2;
                            c13935e5.m3749transient(i16);
                            ad = abstractC7629e.vip(c13935e5, bArr3, ((C17078e) linkedList.remove(0)).ad, ad);
                            i15++;
                            c13935e5.m3740package(i15);
                            i13 = i16;
                        }
                        linkedList.add(0, new C17078e(i15, ad));
                        i10 = i12 + 1;
                        bArr5 = bArr2;
                        i4 = i14;
                    }
                    i2 = i4;
                    bArr4 = ((C17078e) linkedList.get(0)).ad;
                }
                bArr6[i8] = bArr4;
                i8++;
                bArr5 = bArr2;
                i4 = i2;
                c13935e4 = c13935e2;
                i3 = i;
            }
            c11883eArr[i6] = new C11883e(license, bArr6, false, 13);
            i6++;
            c13935e3 = c13935e;
            i5 = 0;
            c13935e4 = c13935e4;
            bArr5 = bArr2;
        }
        return c11883eArr;
    }

    @Override // defpackage.InterfaceC12217e
    public Object isPro(String str) {
        return ((InterfaceC8292e) this.f27641e).appmetrica(str, null);
    }

    @Override // defpackage.InterfaceC18242e
    public InterfaceC13659e isVip() {
        throw null;
    }

    @Override // defpackage.InterfaceC2295e
    public /* bridge */ /* synthetic */ void license(Object obj) {
    }

    @Override // defpackage.InterfaceC6610e
    public void loadAd(C13572e c13572e) {
        this.f27641e = (SecureRandom) c13572e.f26878e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC15935e
    public ByteBuffer metrica() {
        return ((Image.Plane) this.f27641e).getBuffer();
    }

    @Override // defpackage.InterfaceC15813e
    public void mopub() {
    }

    /* renamed from: native, reason: not valid java name */
    public void m3738native(float f, float f2) {
        ((ArrayList) this.f27641e).add(new C11098e(f, f2));
    }

    /* renamed from: new, reason: not valid java name */
    public void m3739new(int i) {
        AbstractC3628e.billing(i, 0, (byte[]) this.f27641e);
    }

    /* renamed from: package, reason: not valid java name */
    public void m3740package(int i) {
        AbstractC3628e.billing(i, 24, (byte[]) this.f27641e);
    }

    public void premium(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f27641e).add(new C15014e(f, f2, f3, f4, f5, f6));
    }

    /* renamed from: private, reason: not valid java name */
    public void m3741private(long j) {
        AbstractC3628e.admob(8, j, (byte[]) this.f27641e);
    }

    @Override // defpackage.InterfaceC11483e
    public void pro() {
    }

    /* renamed from: protected */
    public void mo409protected() {
        m3734final("android.support.v4.media.session.action.PREPARE", null);
    }

    @Override // defpackage.InterfaceC11483e
    public void purchase(int i, int i2, int i3, long j) {
        ((MediaCodec) this.f27641e).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.InterfaceC15813e
    public void remoteconfig(C0520e c0520e, C5302e c5302e) {
    }

    /* renamed from: return, reason: not valid java name */
    public void m3742return(byte[] bArr) {
        m3743static(bArr.length);
        try {
            ((ByteArrayOutputStream) this.f27641e).write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // defpackage.InterfaceC11483e
    public void shutdown() {
    }

    @Override // defpackage.InterfaceC10459e
    public String signatures() {
        return "attempted to overwrite the existing value '" + this.f27641e + '\'';
    }

    @Override // defpackage.InterfaceC10540e
    public void smaato(InterfaceC0665e interfaceC0665e) {
        ((C11898e) this.f27641e).smaato(interfaceC0665e);
    }

    @Override // defpackage.InterfaceC11483e
    public void start() {
    }

    @Override // defpackage.InterfaceC10540e
    public void startapp(InterfaceC0665e interfaceC0665e) {
        ((C11898e) this.f27641e).startapp(interfaceC0665e);
    }

    /* renamed from: static, reason: not valid java name */
    public void m3743static(int i) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f27641e;
        byteArrayOutputStream.write((i >>> 24) & 255);
        byteArrayOutputStream.write((i >>> 16) & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write(i & 255);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void mo3744strictfp(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
        m3734final("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
    }

    public int subs() {
        return AbstractC3628e.metrica(20, (byte[]) this.f27641e);
    }

    @Override // defpackage.InterfaceC15935e
    public int subscription() {
        return ((Image.Plane) this.f27641e).getPixelStride();
    }

    /* renamed from: super, reason: not valid java name */
    public void m3745super(int i) {
        AbstractC3628e.billing(i, 20, (byte[]) this.f27641e);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m3746synchronized(BigInteger bigInteger) {
        m3742return(bigInteger.toByteArray());
    }

    @Override // defpackage.InterfaceC15813e
    public InterfaceC11429e tapsense(C0520e c0520e) {
        String vip = c0520e.vip();
        if ("data".equals(vip) || "filePartClassNames".equals(vip)) {
            return new C14825e(this, 0);
        }
        if ("strings".equals(vip)) {
            return new C14825e(this, 1);
        }
        return null;
    }

    /* renamed from: this, reason: not valid java name */
    public void m3747this(float f, float f2) {
        ((ArrayList) this.f27641e).add(new C5161e(f, f2));
    }

    /* renamed from: throw, reason: not valid java name */
    public void m3748throw(EnumC10668e enumC10668e) {
        C11898e c11898e = (C11898e) this.f27641e;
        int ordinal = enumC10668e.ordinal();
        if (ordinal == 0) {
            int ordinal2 = ((EnumC10668e) c11898e.f23835e).ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    AbstractC14520e.metrica(c11898e);
                    AbstractC14520e.license(c11898e);
                    return;
                } else {
                    if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                        throw new C14803e(10);
                    }
                    AbstractC14520e.license(c11898e);
                    return;
                }
            }
            return;
        }
        if (ordinal != 1) {
            EnumC10668e enumC10668e2 = EnumC10668e.f21008e;
            EnumC10668e enumC10668e3 = EnumC10668e.f21011e;
            if (ordinal == 2) {
                int ordinal3 = ((EnumC10668e) c11898e.f23835e).ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        AbstractC14520e.metrica(c11898e);
                        return;
                    }
                    if (ordinal3 != 2) {
                        if (ordinal3 != 3 && ordinal3 != 4) {
                            throw new C14803e(10);
                        }
                        if (((EnumC10668e) c11898e.f23835e) == enumC10668e2) {
                            c11898e.metrica();
                        }
                        if (((EnumC10668e) c11898e.f23835e) == enumC10668e3) {
                            c11898e.ad();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (ordinal == 3) {
                int ordinal4 = ((EnumC10668e) c11898e.f23835e).ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 == 1 || ordinal4 == 2) {
                        AbstractC14520e.billing(c11898e);
                        return;
                    }
                    if (ordinal4 != 3) {
                        if (ordinal4 != 4) {
                            throw new C14803e(10);
                        }
                        if (((EnumC10668e) c11898e.f23835e) == enumC10668e2) {
                            c11898e.metrica();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (ordinal != 4) {
                throw new C14803e(10);
            }
            int ordinal5 = ((EnumC10668e) c11898e.f23835e).ordinal();
            if (ordinal5 != 0) {
                if (ordinal5 != 1 && ordinal5 != 2 && ordinal5 != 3) {
                    if (ordinal5 != 4) {
                        throw new C14803e(10);
                    }
                } else {
                    AbstractC14520e.billing(c11898e);
                    if (((EnumC10668e) c11898e.f23835e) == enumC10668e3) {
                        c11898e.vip();
                    }
                }
            }
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m3749transient(int i) {
        AbstractC3628e.billing(i, 28, (byte[]) this.f27641e);
    }

    /* renamed from: try, reason: not valid java name */
    public byte[] m3750try(C11883e[] c11883eArr, byte[] bArr, byte[] bArr2, C13935e c13935e) {
        byte[] bArr3 = (byte[]) c13935e.f27641e;
        char c = 2;
        byte[][] bArr4 = new byte[2];
        AbstractC7629e abstractC7629e = (AbstractC7629e) this.f27641e;
        int i = abstractC7629e.yandex;
        byte[][] bArr5 = new byte[i];
        int i2 = abstractC7629e.billing;
        int[] inmobi = inmobi(i2, i, bArr);
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i5 = inmobi[i4];
            byte[] bArr6 = (byte[]) c11883eArr[i4].f23814e;
            c13935e.m3740package(i3);
            c13935e.m3749transient((i4 << i2) + i5);
            bArr4[i3] = abstractC7629e.ad(c13935e, bArr2, bArr6);
            byte[][] bArr7 = (byte[][]) c11883eArr[i4].f23815e;
            c13935e.m3749transient((i4 << i2) + i5);
            int i6 = i3;
            while (i6 < i2) {
                char c2 = c;
                int i7 = i6 + 1;
                c13935e.m3740package(i7);
                int i8 = i3;
                if ((i5 & (1 << i6)) == 0) {
                    c13935e.m3749transient(AbstractC3628e.metrica(28, bArr3) / 2);
                    bArr4[1] = abstractC7629e.vip(c13935e, bArr2, bArr4[i8], bArr7[i6]);
                } else {
                    c13935e.m3749transient((AbstractC3628e.metrica(28, bArr3) - 1) / 2);
                    bArr4[1] = abstractC7629e.vip(c13935e, bArr2, bArr7[i6], bArr4[i8]);
                }
                bArr4[i8] = bArr4[1];
                i3 = i8;
                i6 = i7;
                c = c2;
            }
            bArr5[i4] = bArr4[i3];
            i4++;
            c = c;
        }
        C13935e c13935e2 = new C13935e(c13935e);
        c13935e2.m3736import(4);
        c13935e2.m3745super(c13935e.subs());
        return abstractC7629e.purchase(c13935e2, bArr2, AbstractC12442e.smaato(bArr5));
    }

    @Override // defpackage.InterfaceC11483e
    public void vip(int i, C0579e c0579e, long j, int i2) {
        ((MediaCodec) this.f27641e).queueSecureInputBuffer(i, 0, c0579e.startapp, j, i2);
    }

    /* renamed from: while, reason: not valid java name */
    public C13827e m3751while(JSONObject jSONObject) {
        InterfaceC18295e c6607e;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c6607e = new C11047e(27);
        } else {
            c6607e = new C6607e(8);
        }
        return c6607e.remoteconfig((C9821e) this.f27641e, jSONObject);
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        ((InterfaceC12385e) this.f27641e).close();
    }
}
