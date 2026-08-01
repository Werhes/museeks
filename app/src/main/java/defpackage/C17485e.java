package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17485e extends AbstractC0641e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static final C13141e f34249e = new C13141e(18);

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final C17485e f34250e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f34251e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public List f34252e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public List f34253e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f34254e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C13212e f34255e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public List f34256e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f34257e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f34258e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public int f34259e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f34260e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f34261e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public List f34262e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C10067e f34263e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public byte f34264e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f34265e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public List f34266e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C4307e f34267e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f34268e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public List f34269e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public List f34270e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C4307e f34271e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public List f34272e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f34273e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public List f34274e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f34275e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public List f34276e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13212e f34277e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34278e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public List f34279e;

    static {
        C17485e c17485e = new C17485e();
        f34250e = c17485e;
        c17485e.Signature();
    }

    public C17485e() {
        this.f34257e = -1;
        this.f34264e = (byte) -1;
        this.f34259e = -1;
        this.f34260e = AbstractC6732e.f13911e;
    }

    public C17485e(C1042e c1042e) {
        super(c1042e);
        this.f34257e = -1;
        this.f34264e = (byte) -1;
        this.f34259e = -1;
        this.f34260e = c1042e.f19037e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0037. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public C17485e(C4285e c4285e, C18521e c18521e) {
        C6240e c6240e;
        C6240e c6240e2;
        this.f34257e = -1;
        this.f34264e = (byte) -1;
        this.f34259e = -1;
        Signature();
        C1974e loadAd = AbstractC6732e.loadAd();
        boolean z = true;
        C9831e m2672protected = C9831e.m2672protected(loadAd, 1);
        boolean z2 = false;
        char c = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.f34275e = DesugarCollections.unmodifiableList(this.f34275e);
                }
                if (((c == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f34253e = DesugarCollections.unmodifiableList(this.f34253e);
                }
                if (((c == true ? 1 : 0) & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                    this.f34252e = DesugarCollections.unmodifiableList(this.f34252e);
                }
                if (((c == true ? 1 : 0) & 65536) == 65536) {
                    this.f34256e = DesugarCollections.unmodifiableList(this.f34256e);
                }
                if (((c == true ? 1 : 0) & 131072) == 131072) {
                    this.f34270e = DesugarCollections.unmodifiableList(this.f34270e);
                }
                if (((c == true ? 1 : 0) & 262144) == 262144) {
                    this.f34274e = DesugarCollections.unmodifiableList(this.f34274e);
                }
                if (((c == true ? 1 : 0) & 1024) == 1024) {
                    this.f34262e = DesugarCollections.unmodifiableList(this.f34262e);
                }
                if (((c == true ? 1 : 0) & 16384) == 16384) {
                    this.f34272e = DesugarCollections.unmodifiableList(this.f34272e);
                }
                if (((c == true ? 1 : 0) & 32768) == 32768) {
                    this.f34279e = DesugarCollections.unmodifiableList(this.f34279e);
                }
                if (((c == true ? 1 : 0) & 524288) == 524288) {
                    this.f34276e = DesugarCollections.unmodifiableList(this.f34276e);
                }
                if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f34269e = DesugarCollections.unmodifiableList(this.f34269e);
                }
                if (((c == true ? 1 : 0) & 2097152) == 2097152) {
                    this.f34266e = DesugarCollections.unmodifiableList(this.f34266e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f34260e = loadAd.purchase();
                    throw th;
                }
                this.f34260e = loadAd.purchase();
                smaato();
                return;
            }
            try {
                try {
                    int admob = c4285e.admob();
                    switch (admob) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            c = c;
                        case 8:
                            this.f34254e |= 2;
                            this.f34251e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case 16:
                            this.f34254e |= 4;
                            this.f34278e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            C3333e appmetrica = (this.f34254e & 8) == 8 ? this.f34277e.appmetrica() : null;
                            C13212e c13212e = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                            this.f34277e = c13212e;
                            if (appmetrica != null) {
                                appmetrica.startapp(c13212e);
                                this.f34277e = appmetrica.billing();
                            }
                            this.f34254e |= 8;
                            z = z3;
                            c = c;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            int i = (c == true ? 1 : 0) & 32;
                            c = c;
                            if (i != 32) {
                                this.f34275e = new ArrayList();
                                c = (c == true ? 1 : 0) | ' ';
                            }
                            this.f34275e.add(c4285e.adcel(C8372e.f17124e, c18521e));
                            z = z3;
                            c = c;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            C3333e appmetrica2 = (this.f34254e & 32) == 32 ? this.f34255e.appmetrica() : null;
                            C13212e c13212e2 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                            this.f34255e = c13212e2;
                            if (appmetrica2 != null) {
                                appmetrica2.startapp(c13212e2);
                                this.f34255e = appmetrica2.billing();
                            }
                            this.f34254e |= 32;
                            z = z3;
                            c = c;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            C15908e Signature = (this.f34254e & 128) == 128 ? this.f34263e.Signature() : null;
                            C10067e c10067e = (C10067e) c4285e.adcel(C10067e.f19879e, c18521e);
                            this.f34263e = c10067e;
                            if (Signature != null) {
                                Signature.startapp(c10067e);
                                this.f34263e = Signature.billing();
                            }
                            this.f34254e |= 128;
                            z = z3;
                            c = c;
                        case 56:
                            this.f34254e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            this.f34261e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                            this.f34254e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            this.f34258e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case 72:
                            this.f34254e |= 16;
                            this.f34265e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                            this.f34254e |= 64;
                            this.f34268e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case 88:
                            this.f34254e |= 1;
                            this.f34273e = c4285e.startapp();
                            z = z3;
                            c = c;
                        case 98:
                            int i2 = (c == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            c = c;
                            if (i2 != 256) {
                                this.f34253e = new ArrayList();
                                c = (c == true ? 1 : 0) | 256;
                            }
                            this.f34253e.add(c4285e.adcel(C13212e.f26219e, c18521e));
                            z = z3;
                            c = c;
                        case 104:
                            int i3 = (c == true ? 1 : 0) & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            c = c;
                            if (i3 != 512) {
                                this.f34252e = new ArrayList();
                                c = (c == true ? 1 : 0) | 512;
                            }
                            this.f34252e.add(Integer.valueOf(c4285e.startapp()));
                            z = z3;
                            c = c;
                        case 106:
                            int billing = c4285e.billing(c4285e.amazon());
                            int i4 = (c == true ? 1 : 0) & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            c = c;
                            if (i4 != 512) {
                                c = c;
                                if (c4285e.appmetrica() > 0) {
                                    this.f34252e = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                            }
                            while (c4285e.appmetrica() > 0) {
                                this.f34252e.add(Integer.valueOf(c4285e.startapp()));
                            }
                            c4285e.purchase(billing);
                            z = z3;
                            c = c;
                        case 114:
                            int i5 = (c == true ? 1 : 0) & 65536;
                            c = c;
                            if (i5 != 65536) {
                                this.f34256e = new ArrayList();
                                c = (c == true ? 1 : 0) | 0;
                            }
                            this.f34256e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            z = z3;
                            c = c;
                        case 122:
                            int i6 = (c == true ? 1 : 0) & 131072;
                            c = c;
                            if (i6 != 131072) {
                                this.f34270e = new ArrayList();
                                c = (c == true ? 1 : 0) | 0;
                            }
                            this.f34270e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            z = z3;
                            c = c;
                        case 130:
                            int i7 = (c == true ? 1 : 0) & 262144;
                            c = c;
                            if (i7 != 262144) {
                                this.f34274e = new ArrayList();
                                c = (c == true ? 1 : 0) | 0;
                            }
                            this.f34274e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            z = z3;
                            c = c;
                        case 138:
                            int i8 = (c == true ? 1 : 0) & 1024;
                            c = c;
                            if (i8 != 1024) {
                                this.f34262e = new ArrayList();
                                c = (c == true ? 1 : 0) | 1024;
                            }
                            this.f34262e.add(c4285e.adcel(C10067e.f19879e, c18521e));
                            z = z3;
                            c = c;
                        case 248:
                            int i9 = (c == true ? 1 : 0) & 16384;
                            c = c;
                            if (i9 != 16384) {
                                this.f34272e = new ArrayList();
                                c = (c == true ? 1 : 0) | 16384;
                            }
                            this.f34272e.add(Integer.valueOf(c4285e.startapp()));
                            z = z3;
                            c = c;
                        case 250:
                            int billing2 = c4285e.billing(c4285e.amazon());
                            int i10 = (c == true ? 1 : 0) & 16384;
                            c = c;
                            if (i10 != 16384) {
                                c = c;
                                if (c4285e.appmetrica() > 0) {
                                    this.f34272e = new ArrayList();
                                    c = (c == true ? 1 : 0) | 16384;
                                }
                            }
                            while (c4285e.appmetrica() > 0) {
                                this.f34272e.add(Integer.valueOf(c4285e.startapp()));
                            }
                            c4285e.purchase(billing2);
                            z = z3;
                            c = c;
                        case 258:
                            int i11 = (c == true ? 1 : 0) & 32768;
                            c = c;
                            if (i11 != 32768) {
                                this.f34279e = new ArrayList();
                                c = (c == true ? 1 : 0) | 32768;
                            }
                            this.f34279e.add(c4285e.adcel(C18181e.f35596e, c18521e));
                            z = z3;
                            c = c;
                        case 266:
                            int i12 = (c == true ? 1 : 0) & 524288;
                            c = c;
                            if (i12 != 524288) {
                                this.f34276e = new ArrayList();
                                c = (c == true ? 1 : 0) | 0;
                            }
                            this.f34276e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            z = z3;
                            c = c;
                        case 274:
                            int i13 = (c == true ? 1 : 0) & 1048576;
                            c = c;
                            if (i13 != 1048576) {
                                this.f34269e = new ArrayList();
                                c = (c == true ? 1 : 0) | 0;
                            }
                            this.f34269e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            z = z3;
                            c = c;
                        case 282:
                            int i14 = (c == true ? 1 : 0) & 2097152;
                            c = c;
                            if (i14 != 2097152) {
                                this.f34266e = new ArrayList();
                                c = (c == true ? 1 : 0) | 0;
                            }
                            this.f34266e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            z = z3;
                            c = c;
                        case 322:
                            if ((this.f34254e & 1024) == 1024) {
                                C4307e c4307e = this.f34267e;
                                c4307e.getClass();
                                c6240e2 = new C6240e(0);
                                c6240e2.f13044e = Collections.EMPTY_LIST;
                                c6240e2.adcel(c4307e);
                            } else {
                                c6240e2 = null;
                            }
                            C4307e c4307e2 = (C4307e) c4285e.adcel(C4307e.f9418e, c18521e);
                            this.f34267e = c4307e2;
                            if (c6240e2 != null) {
                                c6240e2.adcel(c4307e2);
                                this.f34267e = c6240e2.purchase();
                            }
                            this.f34254e |= 1024;
                            z = z3;
                            c = c;
                        case 330:
                            try {
                                if ((this.f34254e & 2048) == 2048) {
                                    try {
                                        C4307e c4307e3 = this.f34271e;
                                        c4307e3.getClass();
                                        c6240e = new C6240e(0);
                                        c6240e.f13044e = Collections.EMPTY_LIST;
                                        c6240e.adcel(c4307e3);
                                    } catch (C14226e e) {
                                        e = e;
                                        e.ad(this);
                                        throw e;
                                    } catch (IOException e2) {
                                        e = e2;
                                        C14226e c14226e = new C14226e(e.getMessage());
                                        c14226e.ad(this);
                                        throw c14226e;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (((c == true ? 1 : 0) & 32) == 32) {
                                            this.f34275e = DesugarCollections.unmodifiableList(this.f34275e);
                                        }
                                        if (((c == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                            this.f34253e = DesugarCollections.unmodifiableList(this.f34253e);
                                        }
                                        if (((c == true ? 1 : 0) & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                                            this.f34252e = DesugarCollections.unmodifiableList(this.f34252e);
                                        }
                                        if (((c == true ? 1 : 0) & 65536) == 65536) {
                                            this.f34256e = DesugarCollections.unmodifiableList(this.f34256e);
                                        }
                                        if (((c == true ? 1 : 0) & 131072) == 131072) {
                                            this.f34270e = DesugarCollections.unmodifiableList(this.f34270e);
                                        }
                                        if (((c == true ? 1 : 0) & 262144) == 262144) {
                                            this.f34274e = DesugarCollections.unmodifiableList(this.f34274e);
                                        }
                                        if (((c == true ? 1 : 0) & 1024) == 1024) {
                                            this.f34262e = DesugarCollections.unmodifiableList(this.f34262e);
                                        }
                                        if (((c == true ? 1 : 0) & 16384) == 16384) {
                                            this.f34272e = DesugarCollections.unmodifiableList(this.f34272e);
                                        }
                                        if (((c == true ? 1 : 0) & 32768) == 32768) {
                                            this.f34279e = DesugarCollections.unmodifiableList(this.f34279e);
                                        }
                                        if (((c == true ? 1 : 0) & 524288) == 524288) {
                                            this.f34276e = DesugarCollections.unmodifiableList(this.f34276e);
                                        }
                                        if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                                            this.f34269e = DesugarCollections.unmodifiableList(this.f34269e);
                                        }
                                        if (((c == true ? 1 : 0) & 2097152) == 2097152) {
                                            this.f34266e = DesugarCollections.unmodifiableList(this.f34266e);
                                        }
                                        try {
                                            m2672protected.crashlytics();
                                        } catch (IOException unused2) {
                                        } catch (Throwable th3) {
                                            this.f34260e = loadAd.purchase();
                                            throw th3;
                                        }
                                        this.f34260e = loadAd.purchase();
                                        smaato();
                                        throw th;
                                    }
                                } else {
                                    c6240e = null;
                                }
                                C4307e c4307e4 = (C4307e) c4285e.adcel(C4307e.f9418e, c18521e);
                                this.f34271e = c4307e4;
                                if (c6240e != null) {
                                    c6240e.adcel(c4307e4);
                                    this.f34271e = c6240e.purchase();
                                }
                                this.f34254e |= 2048;
                                z = z3;
                                c = c;
                            } catch (C14226e e3) {
                                e = e3;
                            } catch (IOException e4) {
                                e = e4;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        default:
                            if (amazon(c4285e, m2672protected, c18521e, admob)) {
                                z = z3;
                                c = c;
                            }
                            z2 = z3;
                            z = z3;
                            c = c;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (C14226e e5) {
                e = e5;
            } catch (IOException e6) {
                e = e6;
            }
        }
    }

    public final void Signature() {
        this.f34273e = 518;
        this.f34251e = 2054;
        this.f34278e = 0;
        C13212e c13212e = C13212e.f26218e;
        this.f34277e = c13212e;
        this.f34265e = 0;
        List list = Collections.EMPTY_LIST;
        this.f34275e = list;
        this.f34255e = c13212e;
        this.f34268e = 0;
        this.f34253e = list;
        this.f34252e = list;
        this.f34262e = list;
        this.f34263e = C10067e.f19878e;
        this.f34261e = 0;
        this.f34258e = 0;
        this.f34272e = list;
        this.f34279e = list;
        this.f34256e = list;
        this.f34270e = list;
        this.f34274e = list;
        this.f34276e = list;
        this.f34269e = list;
        this.f34266e = list;
        C4307e c4307e = C4307e.f9417e;
        this.f34267e = c4307e;
        this.f34271e = c4307e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f34264e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f34254e;
        if ((i & 4) != 4) {
            this.f34264e = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f34277e.ad()) {
            this.f34264e = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f34275e.size(); i2++) {
            if (!((C8372e) this.f34275e.get(i2)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        if ((this.f34254e & 32) == 32 && !this.f34255e.ad()) {
            this.f34264e = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f34253e.size(); i3++) {
            if (!((C13212e) this.f34253e.get(i3)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f34262e.size(); i4++) {
            if (!((C10067e) this.f34262e.get(i4)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        if ((this.f34254e & 128) == 128 && !this.f34263e.ad()) {
            this.f34264e = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f34279e.size(); i5++) {
            if (!((C18181e) this.f34279e.get(i5)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f34256e.size(); i6++) {
            if (!((C4599e) this.f34256e.get(i6)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f34270e.size(); i7++) {
            if (!((C4599e) this.f34270e.get(i7)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f34274e.size(); i8++) {
            if (!((C4599e) this.f34274e.get(i8)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f34276e.size(); i9++) {
            if (!((C4599e) this.f34276e.get(i9)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f34269e.size(); i10++) {
            if (!((C4599e) this.f34269e.get(i10)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f34266e.size(); i11++) {
            if (!((C4599e) this.f34266e.get(i11)).ad()) {
                this.f34264e = (byte) 0;
                return false;
            }
        }
        if ((this.f34254e & 1024) == 1024 && !this.f34267e.ad()) {
            this.f34264e = (byte) 0;
            return false;
        }
        if ((this.f34254e & 2048) == 2048 && !this.f34271e.ad()) {
            this.f34264e = (byte) 0;
            return false;
        }
        if (startapp()) {
            this.f34264e = (byte) 1;
            return true;
        }
        this.f34264e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C1042e yandex = C1042e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C1042e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f34259e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f34254e & 2) == 2 ? C9831e.Signature(1, this.f34251e) : 0;
        if ((this.f34254e & 4) == 4) {
            Signature += C9831e.Signature(2, this.f34278e);
        }
        if ((this.f34254e & 8) == 8) {
            Signature += C9831e.subscription(3, this.f34277e);
        }
        for (int i2 = 0; i2 < this.f34275e.size(); i2++) {
            Signature += C9831e.subscription(4, (AbstractC6649e) this.f34275e.get(i2));
        }
        if ((this.f34254e & 32) == 32) {
            Signature += C9831e.subscription(5, this.f34255e);
        }
        if ((this.f34254e & 128) == 128) {
            Signature += C9831e.subscription(6, this.f34263e);
        }
        if ((this.f34254e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            Signature += C9831e.Signature(7, this.f34261e);
        }
        if ((this.f34254e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            Signature += C9831e.Signature(8, this.f34258e);
        }
        if ((this.f34254e & 16) == 16) {
            Signature += C9831e.Signature(9, this.f34265e);
        }
        if ((this.f34254e & 64) == 64) {
            Signature += C9831e.Signature(10, this.f34268e);
        }
        if ((this.f34254e & 1) == 1) {
            Signature += C9831e.Signature(11, this.f34273e);
        }
        for (int i3 = 0; i3 < this.f34253e.size(); i3++) {
            Signature += C9831e.subscription(12, (AbstractC6649e) this.f34253e.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f34252e.size(); i5++) {
            i4 += C9831e.admob(((Integer) this.f34252e.get(i5)).intValue());
        }
        int i6 = Signature + i4;
        if (!this.f34252e.isEmpty()) {
            i6 = i6 + 1 + C9831e.admob(i4);
        }
        this.f34257e = i4;
        for (int i7 = 0; i7 < this.f34256e.size(); i7++) {
            i6 += C9831e.subscription(14, (AbstractC6649e) this.f34256e.get(i7));
        }
        for (int i8 = 0; i8 < this.f34270e.size(); i8++) {
            i6 += C9831e.subscription(15, (AbstractC6649e) this.f34270e.get(i8));
        }
        for (int i9 = 0; i9 < this.f34274e.size(); i9++) {
            i6 += C9831e.subscription(16, (AbstractC6649e) this.f34274e.get(i9));
        }
        for (int i10 = 0; i10 < this.f34262e.size(); i10++) {
            i6 += C9831e.subscription(17, (AbstractC6649e) this.f34262e.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34272e.size(); i12++) {
            i11 += C9831e.admob(((Integer) this.f34272e.get(i12)).intValue());
        }
        int size = (this.f34272e.size() * 2) + i6 + i11;
        for (int i13 = 0; i13 < this.f34279e.size(); i13++) {
            size += C9831e.subscription(32, (AbstractC6649e) this.f34279e.get(i13));
        }
        for (int i14 = 0; i14 < this.f34276e.size(); i14++) {
            size += C9831e.subscription(33, (AbstractC6649e) this.f34276e.get(i14));
        }
        for (int i15 = 0; i15 < this.f34269e.size(); i15++) {
            size += C9831e.subscription(34, (AbstractC6649e) this.f34269e.get(i15));
        }
        for (int i16 = 0; i16 < this.f34266e.size(); i16++) {
            size += C9831e.subscription(35, (AbstractC6649e) this.f34266e.get(i16));
        }
        if ((this.f34254e & 1024) == 1024) {
            size += C9831e.subscription(40, this.f34267e);
        }
        if ((this.f34254e & 2048) == 2048) {
            size += C9831e.subscription(41, this.f34271e);
        }
        int size2 = this.f34260e.size() + adcel() + size;
        this.f34259e = size2;
        return size2;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f34254e & 2) == 2) {
            c9831e.m2695for(1, this.f34251e);
        }
        if ((this.f34254e & 4) == 4) {
            c9831e.m2695for(2, this.f34278e);
        }
        if ((this.f34254e & 8) == 8) {
            c9831e.m2704public(3, this.f34277e);
        }
        for (int i = 0; i < this.f34275e.size(); i++) {
            c9831e.m2704public(4, (AbstractC6649e) this.f34275e.get(i));
        }
        if ((this.f34254e & 32) == 32) {
            c9831e.m2704public(5, this.f34255e);
        }
        if ((this.f34254e & 128) == 128) {
            c9831e.m2704public(6, this.f34263e);
        }
        if ((this.f34254e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c9831e.m2695for(7, this.f34261e);
        }
        if ((this.f34254e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            c9831e.m2695for(8, this.f34258e);
        }
        if ((this.f34254e & 16) == 16) {
            c9831e.m2695for(9, this.f34265e);
        }
        if ((this.f34254e & 64) == 64) {
            c9831e.m2695for(10, this.f34268e);
        }
        if ((this.f34254e & 1) == 1) {
            c9831e.m2695for(11, this.f34273e);
        }
        for (int i2 = 0; i2 < this.f34253e.size(); i2++) {
            c9831e.m2704public(12, (AbstractC6649e) this.f34253e.get(i2));
        }
        if (this.f34252e.size() > 0) {
            c9831e.m2689e(106);
            c9831e.m2689e(this.f34257e);
        }
        for (int i3 = 0; i3 < this.f34252e.size(); i3++) {
            c9831e.m2680continue(((Integer) this.f34252e.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f34256e.size(); i4++) {
            c9831e.m2704public(14, (AbstractC6649e) this.f34256e.get(i4));
        }
        for (int i5 = 0; i5 < this.f34270e.size(); i5++) {
            c9831e.m2704public(15, (AbstractC6649e) this.f34270e.get(i5));
        }
        for (int i6 = 0; i6 < this.f34274e.size(); i6++) {
            c9831e.m2704public(16, (AbstractC6649e) this.f34274e.get(i6));
        }
        for (int i7 = 0; i7 < this.f34262e.size(); i7++) {
            c9831e.m2704public(17, (AbstractC6649e) this.f34262e.get(i7));
        }
        for (int i8 = 0; i8 < this.f34272e.size(); i8++) {
            c9831e.m2695for(31, ((Integer) this.f34272e.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.f34279e.size(); i9++) {
            c9831e.m2704public(32, (AbstractC6649e) this.f34279e.get(i9));
        }
        for (int i10 = 0; i10 < this.f34276e.size(); i10++) {
            c9831e.m2704public(33, (AbstractC6649e) this.f34276e.get(i10));
        }
        for (int i11 = 0; i11 < this.f34269e.size(); i11++) {
            c9831e.m2704public(34, (AbstractC6649e) this.f34269e.get(i11));
        }
        for (int i12 = 0; i12 < this.f34266e.size(); i12++) {
            c9831e.m2704public(35, (AbstractC6649e) this.f34266e.get(i12));
        }
        if ((this.f34254e & 1024) == 1024) {
            c9831e.m2704public(40, this.f34267e);
        }
        if ((this.f34254e & 2048) == 2048) {
            c9831e.m2704public(41, this.f34271e);
        }
        c18540e.m4583synchronized(19000, c9831e);
        c9831e.m2690e(this.f34260e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f34250e;
    }
}
