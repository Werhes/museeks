package defpackage;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518e implements InterfaceC1272e {

    /* renamed from: const, reason: not valid java name */
    public static final byte[] f2629const;

    /* renamed from: continue, reason: not valid java name */
    public static final UUID f2630continue;

    /* renamed from: finally, reason: not valid java name */
    public static final byte[] f2631finally = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: for, reason: not valid java name */
    public static final byte[] f2632for;

    /* renamed from: public, reason: not valid java name */
    public static final Map f2633public;

    /* renamed from: volatile, reason: not valid java name */
    public static final byte[] f2634volatile;
    public final C1292e Signature;

    /* renamed from: abstract, reason: not valid java name */
    public long f2635abstract;
    public final C6011e ad;
    public final C1292e adcel;
    public ByteBuffer admob;
    public int ads;
    public final C1292e advert;
    public final C1292e amazon;
    public boolean applovin;
    public final boolean appmetrica;
    public final C1292e billing;

    /* renamed from: break, reason: not valid java name */
    public long f2636break;

    /* renamed from: case, reason: not valid java name */
    public int[] f2637case;

    /* renamed from: catch, reason: not valid java name */
    public int f2638catch;

    /* renamed from: class, reason: not valid java name */
    public int f2639class;
    public boolean crashlytics;

    /* renamed from: default, reason: not valid java name */
    public int f2640default;

    /* renamed from: else, reason: not valid java name */
    public byte f2641else;

    /* renamed from: extends, reason: not valid java name */
    public long f2642extends;

    /* renamed from: final, reason: not valid java name */
    public int f2643final;
    public long firebase;

    /* renamed from: goto, reason: not valid java name */
    public long f2644goto;

    /* renamed from: implements, reason: not valid java name */
    public int f2645implements;

    /* renamed from: import, reason: not valid java name */
    public int f2646import;
    public boolean inmobi;

    /* renamed from: instanceof, reason: not valid java name */
    public boolean f2647instanceof;

    /* renamed from: interface, reason: not valid java name */
    public long f2648interface;
    public C7657e isPro;
    public boolean isVip;
    public final boolean license;
    public final C1292e loadAd;
    public final SparseArray metrica;
    public final C1292e mopub;

    /* renamed from: native, reason: not valid java name */
    public boolean f2649native;

    /* renamed from: new, reason: not valid java name */
    public int f2650new;

    /* renamed from: package, reason: not valid java name */
    public int f2651package;
    public long premium;

    /* renamed from: private, reason: not valid java name */
    public long f2652private;
    public long pro;

    /* renamed from: protected, reason: not valid java name */
    public int f2653protected;
    public final InterfaceC7854e purchase;
    public long remoteconfig;

    /* renamed from: return, reason: not valid java name */
    public int f2654return;
    public long signatures;
    public final C1292e smaato;
    public final C1292e startapp;

    /* renamed from: static, reason: not valid java name */
    public boolean f2655static;

    /* renamed from: strictfp, reason: not valid java name */
    public boolean f2656strictfp;
    public final SparseArray subs;
    public long subscription;

    /* renamed from: super, reason: not valid java name */
    public int f2657super;

    /* renamed from: switch, reason: not valid java name */
    public boolean f2658switch;

    /* renamed from: synchronized, reason: not valid java name */
    public boolean f2659synchronized;
    public long tapsense;

    /* renamed from: this, reason: not valid java name */
    public int f2660this;

    /* renamed from: throw, reason: not valid java name */
    public long f2661throw;

    /* renamed from: throws, reason: not valid java name */
    public InterfaceC5483e f2662throws;

    /* renamed from: transient, reason: not valid java name */
    public int f2663transient;

    /* renamed from: try, reason: not valid java name */
    public boolean f2664try;
    public final C10629e vip;

    /* renamed from: while, reason: not valid java name */
    public long f2665while;
    public final C1292e yandex;

    static {
        String str = AbstractC9413e.ad;
        f2629const = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f2634volatile = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f2632for = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f2630continue = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC13501e.smaato(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC13501e.smaato(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f2633public = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C0518e(InterfaceC7854e interfaceC7854e, int i) {
        C6011e c6011e = new C6011e();
        this.remoteconfig = -1L;
        this.pro = -9223372036854775807L;
        this.signatures = -9223372036854775807L;
        this.tapsense = -9223372036854775807L;
        this.firebase = -9223372036854775807L;
        this.f2639class = -1;
        this.f2648interface = -1L;
        this.f2644goto = -1L;
        this.f2660this = -1;
        this.f2642extends = -1L;
        this.f2661throw = -1L;
        this.f2665while = -9223372036854775807L;
        this.ad = c6011e;
        c6011e.license = new C5389e(18, this);
        this.purchase = interfaceC7854e;
        this.subs = new SparseArray();
        this.license = (i & 1) == 0;
        this.appmetrica = (i & 2) == 0;
        this.vip = new C10629e(1);
        this.metrica = new SparseArray();
        this.startapp = new C1292e(4);
        this.adcel = new C1292e(ByteBuffer.allocate(4).putInt(-1).array());
        this.mopub = new C1292e(4);
        this.billing = new C1292e(AbstractC17595e.ad);
        this.yandex = new C1292e(4);
        this.advert = new C1292e();
        this.smaato = new C1292e();
        this.amazon = new C1292e(8);
        this.loadAd = new C1292e();
        this.Signature = new C1292e();
        this.f2637case = new int[1];
        this.inmobi = true;
    }

    public static byte[] adcel(String str, long j, long j2) {
        AbstractC2301e.billing(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = AbstractC9413e.ad;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    public final int Signature(InterfaceC2283e interfaceC2283e, C7657e c7657e, int i, boolean z) {
        int purchase;
        int purchase2;
        int i2;
        if ("S_TEXT/UTF8".equals(c7657e.metrica)) {
            admob(interfaceC2283e, f2631finally, i);
            int i3 = this.f2663transient;
            amazon();
            return i3;
        }
        if ("S_TEXT/ASS".equals(c7657e.metrica) || "S_TEXT/SSA".equals(c7657e.metrica)) {
            admob(interfaceC2283e, f2634volatile, i);
            int i4 = this.f2663transient;
            amazon();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(c7657e.metrica)) {
            admob(interfaceC2283e, f2632for, i);
            int i5 = this.f2663transient;
            amazon();
            return i5;
        }
        if (c7657e.f15572super) {
            c7657e.f15575transient.getClass();
            C1292e c1292e = new C1292e(i);
            if (interfaceC2283e.billing(c1292e.ad, 0, i, true)) {
                interfaceC2283e.smaato();
                if (AbstractC9110e.metrica(c1292e.startapp()) == 1 && c1292e.ad() >= 10) {
                    byte[] bArr = new byte[10];
                    c1292e.mopub(0, 10, bArr);
                    c1292e.m571try(0);
                    int vip = AbstractC9110e.vip(bArr);
                    if (vip > 0 && c1292e.ad() >= vip + 4) {
                        c1292e.m568protected(vip);
                        if (AbstractC9110e.metrica(c1292e.smaato()) == 2) {
                            C11445e ad = c7657e.f15575transient.ad();
                            ad.amazon = AbstractC8542e.amazon("audio/vnd.dts.hd");
                            c7657e.f15575transient = new C16975e(ad);
                        }
                    }
                }
            }
            c7657e.f15568package.billing(c7657e.f15575transient);
            c7657e.f15572super = false;
            mopub();
        }
        InterfaceC18147e interfaceC18147e = c7657e.f15568package;
        boolean z2 = this.f2647instanceof;
        C1292e c1292e2 = this.advert;
        if (!z2) {
            boolean z3 = c7657e.startapp;
            C1292e c1292e3 = this.startapp;
            if (z3) {
                this.f2657super &= -1073741825;
                if (!this.f2655static) {
                    interfaceC2283e.readFully(c1292e3.ad, 0, 1);
                    this.f2651package++;
                    byte b = c1292e3.ad[0];
                    if ((b & 128) == 128) {
                        throw C15125e.ad(null, "Extension bit is set in signal byte");
                    }
                    this.f2641else = b;
                    this.f2655static = true;
                }
                byte b2 = this.f2641else;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.f2657super |= 1073741824;
                    if (!this.f2658switch) {
                        C1292e c1292e4 = this.amazon;
                        interfaceC2283e.readFully(c1292e4.ad, 0, 8);
                        this.f2651package += 8;
                        this.f2658switch = true;
                        c1292e3.ad[0] = (byte) ((z4 ? 128 : 0) | 8);
                        c1292e3.m571try(0);
                        interfaceC18147e.vip(c1292e3, 1, 1);
                        this.f2663transient++;
                        c1292e4.m571try(0);
                        interfaceC18147e.vip(c1292e4, 8, 1);
                        this.f2663transient += 8;
                    }
                    if (z4) {
                        if (!this.f2659synchronized) {
                            interfaceC2283e.readFully(c1292e3.ad, 0, 1);
                            this.f2651package++;
                            c1292e3.m571try(0);
                            this.f2654return = c1292e3.ads();
                            this.f2659synchronized = true;
                        }
                        int i6 = this.f2654return * 4;
                        c1292e3.m564extends(i6);
                        interfaceC2283e.readFully(c1292e3.ad, 0, i6);
                        this.f2651package += i6;
                        short s = (short) ((this.f2654return / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.admob;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.admob = ByteBuffer.allocate(i7);
                        }
                        this.admob.position(0);
                        this.admob.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f2654return;
                            if (i8 >= i2) {
                                break;
                            }
                            int firebase = c1292e3.firebase();
                            if (i8 % 2 == 0) {
                                this.admob.putShort((short) (firebase - i9));
                            } else {
                                this.admob.putInt(firebase - i9);
                            }
                            i8++;
                            i9 = firebase;
                        }
                        int i10 = (i - this.f2651package) - i9;
                        if (i2 % 2 == 1) {
                            this.admob.putInt(i10);
                        } else {
                            this.admob.putShort((short) i10);
                            this.admob.putInt(0);
                        }
                        byte[] array = this.admob.array();
                        C1292e c1292e5 = this.loadAd;
                        c1292e5.m570throw(i7, array);
                        interfaceC18147e.vip(c1292e5, i7, 1);
                        this.f2663transient += i7;
                    }
                }
            } else {
                byte[] bArr2 = c7657e.adcel;
                if (bArr2 != null) {
                    c1292e2.m570throw(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(c7657e.metrica) ? z : c7657e.billing > 0) {
                this.f2657super |= 268435456;
                this.Signature.m564extends(0);
                int i11 = (c1292e2.metrica + i) - this.f2651package;
                c1292e3.m564extends(4);
                byte[] bArr3 = c1292e3.ad;
                bArr3[0] = (byte) ((i11 >> 24) & 255);
                bArr3[1] = (byte) ((i11 >> 16) & 255);
                bArr3[2] = (byte) ((i11 >> 8) & 255);
                bArr3[3] = (byte) (i11 & 255);
                interfaceC18147e.vip(c1292e3, 4, 2);
                this.f2663transient += 4;
            }
            this.f2647instanceof = true;
        }
        int i12 = i + c1292e2.metrica;
        if (!"V_MPEG4/ISO/AVC".equals(c7657e.metrica) && !"V_MPEGH/ISO/HEVC".equals(c7657e.metrica)) {
            if (c7657e.f15561final != null) {
                AbstractC2301e.subscription(c1292e2.metrica == 0);
                c7657e.f15561final.metrica(interfaceC2283e);
            }
            while (true) {
                int i13 = this.f2651package;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int ad2 = c1292e2.ad();
                if (ad2 > 0) {
                    purchase2 = Math.min(i14, ad2);
                    interfaceC18147e.appmetrica(purchase2, c1292e2);
                } else {
                    purchase2 = interfaceC18147e.purchase(interfaceC2283e, i14, false);
                }
                this.f2651package += purchase2;
                this.f2663transient += purchase2;
            }
        } else {
            C1292e c1292e6 = this.yandex;
            byte[] bArr4 = c1292e6.ad;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i15 = c7657e.f15564import;
            int i16 = 4 - i15;
            while (this.f2651package < i12) {
                int i17 = this.f2646import;
                if (i17 == 0) {
                    int min = Math.min(i15, c1292e2.ad());
                    interfaceC2283e.readFully(bArr4, i16 + min, i15 - min);
                    if (min > 0) {
                        c1292e2.mopub(i16, min, bArr4);
                    }
                    this.f2651package += i15;
                    c1292e6.m571try(0);
                    this.f2646import = c1292e6.firebase();
                    C1292e c1292e7 = this.billing;
                    c1292e7.m571try(0);
                    interfaceC18147e.appmetrica(4, c1292e7);
                    this.f2663transient += 4;
                } else {
                    int ad3 = c1292e2.ad();
                    if (ad3 > 0) {
                        purchase = Math.min(i17, ad3);
                        interfaceC18147e.appmetrica(purchase, c1292e2);
                    } else {
                        purchase = interfaceC18147e.purchase(interfaceC2283e, i17, false);
                    }
                    this.f2651package += purchase;
                    this.f2663transient += purchase;
                    this.f2646import -= purchase;
                }
            }
        }
        if ("A_VORBIS".equals(c7657e.metrica)) {
            C1292e c1292e8 = this.adcel;
            c1292e8.m571try(0);
            interfaceC18147e.appmetrica(4, c1292e8);
            this.f2663transient += 4;
        }
        int i18 = this.f2663transient;
        amazon();
        return i18;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    public final void admob(InterfaceC2283e interfaceC2283e, byte[] bArr, int i) {
        int length = bArr.length + i;
        C1292e c1292e = this.smaato;
        byte[] bArr2 = c1292e.ad;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            c1292e.getClass();
            c1292e.m570throw(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        interfaceC2283e.readFully(c1292e.ad, bArr.length, i);
        c1292e.m571try(0);
        c1292e.m572while(length);
    }

    public final boolean advert(C14829e c14829e, long j) {
        if (this.f2649native) {
            this.f2661throw = j;
            c14829e.f29362e = this.f2642extends;
            this.f2649native = false;
            return true;
        }
        if (this.applovin) {
            long j2 = this.f2661throw;
            if (j2 != -1) {
                c14829e.f29362e = j2;
                this.f2661throw = -1L;
                return true;
            }
        }
        return false;
    }

    public final void amazon() {
        this.f2651package = 0;
        this.f2663transient = 0;
        this.f2646import = 0;
        this.f2647instanceof = false;
        this.f2655static = false;
        this.f2659synchronized = false;
        this.f2654return = 0;
        this.f2641else = (byte) 0;
        this.f2658switch = false;
        this.advert.m564extends(0);
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final void billing(int i) {
        if (this.crashlytics) {
            return;
        }
        throw C15125e.ad(null, "Element " + i + " must be in a Cues");
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.f2665while = -9223372036854775807L;
        this.f2653protected = 0;
        C6011e c6011e = this.ad;
        c6011e.appmetrica = 0;
        c6011e.vip.clear();
        C10629e c10629e = c6011e.metrica;
        c10629e.f20951e = 0;
        c10629e.f20950e = 0;
        C10629e c10629e2 = this.vip;
        c10629e2.f20951e = 0;
        c10629e2.f20950e = 0;
        amazon();
        this.crashlytics = false;
        this.firebase = -9223372036854775807L;
        this.f2639class = -1;
        this.f2648interface = -1L;
        this.f2644goto = -1L;
        if (!this.applovin) {
            this.subs.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.metrica;
            if (i >= sparseArray.size()) {
                return;
            }
            C13811e c13811e = ((C7657e) sparseArray.valueAt(i)).f15561final;
            if (c13811e != null) {
                c13811e.vip = false;
                c13811e.metrica = 0;
            }
            i++;
        }
    }

    public final long loadAd(long j) {
        long j2 = this.pro;
        if (j2 == -9223372036854775807L) {
            throw C15125e.ad(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = AbstractC9413e.ad;
        return AbstractC9413e.m2555import(j, j2, 1000L, RoundingMode.DOWN);
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C13572e c13572e = new C13572e(20);
        C1292e c1292e = (C1292e) c13572e.f26878e;
        C14446e c14446e = (C14446e) interfaceC2283e;
        long j = c14446e.f28556e;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        c14446e.billing(c1292e.ad, 0, 4, false);
        long subs = c1292e.subs();
        c13572e.f26879e = 4;
        while (true) {
            if (subs != 440786851) {
                int i2 = c13572e.f26879e + 1;
                c13572e.f26879e = i2;
                if (i2 == i) {
                    break;
                }
                c14446e.billing(c1292e.ad, 0, 1, false);
                subs = ((subs << 8) & (-256)) | (c1292e.ad[0] & 255);
            } else {
                long tapsense = c13572e.tapsense(c14446e);
                long j3 = c13572e.f26879e;
                if (tapsense != Long.MIN_VALUE && (j == -1 || j3 + tapsense < j)) {
                    while (true) {
                        long j4 = c13572e.f26879e;
                        long j5 = j3 + tapsense;
                        if (j4 < j5) {
                            if (c13572e.tapsense(c14446e) != Long.MIN_VALUE) {
                                long tapsense2 = c13572e.tapsense(c14446e);
                                if (tapsense2 < 0 || tapsense2 > 2147483647L) {
                                    break;
                                }
                                if (tapsense2 != 0) {
                                    int i3 = (int) tapsense2;
                                    c14446e.mopub(i3, false);
                                    c13572e.f26879e += i3;
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void mopub() {
        if (!this.inmobi) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.metrica;
            if (i >= sparseArray.size()) {
                InterfaceC5483e interfaceC5483e = this.f2662throws;
                interfaceC5483e.getClass();
                interfaceC5483e.mopub();
                this.inmobi = false;
                return;
            }
            if (((C7657e) sparseArray.valueAt(i)).f15572super) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        if (this.appmetrica) {
            interfaceC5483e = new C5609e(interfaceC5483e, this.purchase);
        }
        this.f2662throws = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    public final void smaato(InterfaceC2283e interfaceC2283e, int i) {
        C1292e c1292e = this.startapp;
        if (c1292e.metrica >= i) {
            return;
        }
        byte[] bArr = c1292e.ad;
        if (bArr.length < i) {
            c1292e.metrica(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c1292e.ad;
        int i2 = c1292e.metrica;
        interfaceC2283e.readFully(bArr2, i2, i - i2);
        c1292e.m572while(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(defpackage.C7657e r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0518e.startapp(eًؑۜ, long, int, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0f90, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0f97, code lost:
    
        r3 = r34;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0f91, code lost:
    
        r0 = r42;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a39, code lost:
    
        if (r0.signatures() == r1.getLeastSignificantBits()) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d5a, code lost:
    
        r4 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f7e, code lost:
    
        if (r4 == false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0f80, code lost:
    
        r0 = r42;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0f8e, code lost:
    
        if (r0.advert(r44, r1.getPosition()) == false) goto L926;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:211:0x0518. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:218:0x06f4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Type inference failed for: r2v46, types: [eًؑۜ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v151 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v130 */
    /* JADX WARN: Type inference failed for: r6v131, types: [int] */
    /* JADX WARN: Type inference failed for: r6v133 */
    /* JADX WARN: Type inference failed for: r6v134, types: [int] */
    /* JADX WARN: Type inference failed for: r6v137 */
    /* JADX WARN: Type inference failed for: r6v138, types: [int] */
    /* JADX WARN: Type inference failed for: r6v144 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v146 */
    /* JADX WARN: Type inference failed for: r7v0, types: [eَۣۡ] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.SparseArray] */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r43, defpackage.C14829e r44) {
        /*
            Method dump skipped, instructions count: 4894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0518e.vip(eَؔؐ, eٜٔؓ):int");
    }

    public final void yandex(int i) {
        if (this.isPro != null) {
            return;
        }
        throw C15125e.ad(null, "Element " + i + " must be in a TrackEntry");
    }
}
