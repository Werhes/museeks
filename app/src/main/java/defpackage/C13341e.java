package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13341e implements Closeable {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Logger f26587e = Logger.getLogger(AbstractC17432e.class.getName());

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C7164e f26588e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f26589e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16151e f26590e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f26591e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC11855e f26592e;

    /* JADX WARN: Type inference failed for: r2v1, types: [eِٖۢ, java.lang.Object] */
    public C13341e(InterfaceC11855e interfaceC11855e) {
        this.f26592e = interfaceC11855e;
        ?? obj = new Object();
        this.f26590e = obj;
        this.f26589e = 16384;
        this.f26588e = new C7164e(obj);
    }

    public final void Signature(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f26591e) {
                throw new IOException("closed");
            }
            purchase(0, 8, 6, z ? 1 : 0);
            this.f26592e.writeInt(i);
            this.f26592e.writeInt(i2);
            this.f26592e.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void ad(C7207e c7207e) {
        synchronized (this) {
            try {
                if (this.f26591e) {
                    throw new IOException("closed");
                }
                int i = this.f26589e;
                int i2 = c7207e.ad;
                if ((i2 & 32) != 0) {
                    i = c7207e.vip[5];
                }
                this.f26589e = i;
                if (((i2 & 2) != 0 ? c7207e.vip[1] : -1) != -1) {
                    C7164e c7164e = this.f26588e;
                    int min = Math.min((i2 & 2) != 0 ? c7207e.vip[1] : -1, 16384);
                    int i3 = c7164e.license;
                    if (i3 != min) {
                        if (min < i3) {
                            c7164e.vip = Math.min(c7164e.vip, min);
                        }
                        c7164e.metrica = true;
                        c7164e.license = min;
                        int i4 = c7164e.yandex;
                        if (min < i4) {
                            if (min == 0) {
                                C4861e[] c4861eArr = c7164e.appmetrica;
                                Arrays.fill(c4861eArr, 0, c4861eArr.length, (Object) null);
                                c7164e.purchase = c7164e.appmetrica.length - 1;
                                c7164e.billing = 0;
                                c7164e.yandex = 0;
                            } else {
                                c7164e.ad(i4 - min);
                            }
                        }
                    }
                }
                purchase(0, 0, 4, 1);
                this.f26592e.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ads(int i, long j) {
        synchronized (this) {
            try {
                if (this.f26591e) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f26587e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC17432e.metrica(i, 4, j, false));
                }
                purchase(i, 4, 8, 0);
                this.f26592e.writeInt((int) j);
                this.f26592e.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void advert(int i, int i2, byte[] bArr) {
        synchronized (this) {
            if (this.f26591e) {
                throw new IOException("closed");
            }
            if (AbstractC8703e.m2467class(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            purchase(0, bArr.length + 8, 7, 0);
            this.f26592e.writeInt(i);
            this.f26592e.writeInt(AbstractC8703e.m2467class(i2));
            if (bArr.length != 0) {
                this.f26592e.write(bArr);
            }
            this.f26592e.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f26591e = true;
            this.f26592e.close();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f26591e) {
                throw new IOException("closed");
            }
            this.f26592e.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void inmobi(C7207e c7207e) {
        synchronized (this) {
            try {
                if (this.f26591e) {
                    throw new IOException("closed");
                }
                purchase(0, Integer.bitCount(c7207e.ad) * 6, 4, 0);
                for (int i = 0; i < 10; i++) {
                    boolean z = true;
                    if (((1 << i) & c7207e.ad) == 0) {
                        z = false;
                    }
                    if (z) {
                        this.f26592e.writeShort(i);
                        this.f26592e.writeInt(c7207e.vip[i]);
                    }
                }
                this.f26592e.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void isVip(int i, int i2) {
        synchronized (this) {
            if (this.f26591e) {
                throw new IOException("closed");
            }
            if (AbstractC8703e.m2467class(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            purchase(i, 4, 3, 0);
            this.f26592e.writeInt(AbstractC8703e.m2467class(i2));
            this.f26592e.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void license(boolean z, int i, C16151e c16151e, int i2) {
        synchronized (this) {
            if (this.f26591e) {
                throw new IOException("closed");
            }
            purchase(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.f26592e.mo272transient(c16151e, i2);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void loadAd(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f26591e) {
                throw new IOException("closed");
            }
            this.f26588e.license(arrayList);
            long j = this.f26590e.f31731e;
            long min = Math.min(this.f26589e, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            purchase(i, (int) min, 1, i2);
            this.f26592e.mo272transient(this.f26590e, min);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.f26589e, j2);
                    j2 -= min2;
                    purchase(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.f26592e.mo272transient(this.f26590e, min2);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void purchase(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f26587e;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC17432e.vip(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f26589e) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f26589e + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC10220e.ad;
        InterfaceC11855e interfaceC11855e = this.f26592e;
        interfaceC11855e.writeByte((i2 >>> 16) & 255);
        interfaceC11855e.writeByte((i2 >>> 8) & 255);
        interfaceC11855e.writeByte(i2 & 255);
        interfaceC11855e.writeByte(i3 & 255);
        interfaceC11855e.writeByte(i4 & 255);
        interfaceC11855e.writeInt(i & Alert.DURATION_SHOW_INDEFINITELY);
    }
}
