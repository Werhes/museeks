package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14177e implements Closeable {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Logger f28020e = Logger.getLogger(AbstractC17432e.class.getName());

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0588e f28021e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8387e f28022e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4895e f28023e;

    public C14177e(InterfaceC4895e interfaceC4895e) {
        this.f28023e = interfaceC4895e;
        C8387e c8387e = new C8387e(interfaceC4895e);
        this.f28022e = c8387e;
        this.f28021e = new C0588e(c8387e);
    }

    public final void Signature(C12056e c12056e, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException(AbstractC1786e.admob(i, "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int readInt = this.f28023e.readInt();
        int readInt2 = this.f28023e.readInt();
        if (!((i2 & 1) != 0)) {
            C10497e.metrica(((C10142e) c12056e.f24161e).f20068e, AbstractC1786e.signatures(new StringBuilder(), ((C10142e) c12056e.f24161e).f20059e, " ping"), 0L, new C11162e((C10142e) c12056e.f24161e, readInt, readInt2, 1), 6);
            return;
        }
        C10142e c10142e = (C10142e) c12056e.f24161e;
        synchronized (c10142e) {
            try {
                if (readInt == 1) {
                    c10142e.f20058e++;
                } else if (readInt != 2) {
                    if (readInt == 3) {
                        c10142e.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    c10142e.f20062e++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0156, code lost:
    
        throw new java.io.IOException(defpackage.AbstractC1786e.admob(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ad(boolean r19, defpackage.C12056e r20) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14177e.ad(boolean, eِۢٔ):boolean");
    }

    public final List advert(int i, int i2, int i3, int i4) {
        C8387e c8387e = this.f28022e;
        c8387e.f17155e = i;
        c8387e.f17157e = i;
        c8387e.f17160e = i2;
        c8387e.f17156e = i3;
        c8387e.f17158e = i4;
        C0588e c0588e = this.f28021e;
        C13197e c13197e = c0588e.metrica;
        ArrayList arrayList = c0588e.vip;
        while (!c13197e.yandex()) {
            byte readByte = c13197e.readByte();
            byte[] bArr = AbstractC10220e.ad;
            int i5 = readByte & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int appmetrica = c0588e.appmetrica(i5, 127);
                int i6 = appmetrica - 1;
                if (i6 >= 0) {
                    C4861e[] c4861eArr = AbstractC13205e.ad;
                    if (i6 <= c4861eArr.length - 1) {
                        arrayList.add(c4861eArr[i6]);
                    }
                }
                int length = c0588e.appmetrica + 1 + (i6 - AbstractC13205e.ad.length);
                if (length >= 0) {
                    C4861e[] c4861eArr2 = c0588e.license;
                    if (length < c4861eArr2.length) {
                        arrayList.add(c4861eArr2[length]);
                    }
                }
                throw new IOException(AbstractC1786e.admob(appmetrica, "Header index too large "));
            }
            if (i5 == 64) {
                C4861e[] c4861eArr3 = AbstractC13205e.ad;
                C0193e license = c0588e.license();
                AbstractC13205e.ad(license);
                c0588e.metrica(new C4861e(license, c0588e.license()));
            } else if ((readByte & 64) == 64) {
                c0588e.metrica(new C4861e(c0588e.vip(c0588e.appmetrica(i5, 63) - 1), c0588e.license()));
            } else if ((readByte & 32) == 32) {
                int appmetrica2 = c0588e.appmetrica(i5, 31);
                c0588e.ad = appmetrica2;
                if (appmetrica2 < 0 || appmetrica2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c0588e.ad);
                }
                int i7 = c0588e.billing;
                if (appmetrica2 < i7) {
                    if (appmetrica2 == 0) {
                        AbstractC1660e.inmobi(null, c0588e.license);
                        c0588e.appmetrica = c0588e.license.length - 1;
                        c0588e.purchase = 0;
                        c0588e.billing = 0;
                    } else {
                        c0588e.ad(i7 - appmetrica2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C4861e[] c4861eArr4 = AbstractC13205e.ad;
                C0193e license2 = c0588e.license();
                AbstractC13205e.ad(license2);
                arrayList.add(new C4861e(license2, c0588e.license()));
            } else {
                arrayList.add(new C4861e(c0588e.vip(c0588e.appmetrica(i5, 15) - 1), c0588e.license()));
            }
        }
        List m3575continue = AbstractC13480e.m3575continue(arrayList);
        arrayList.clear();
        return m3575continue;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28023e.close();
    }

    public final void isVip(C12056e c12056e, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.f28023e.readByte();
            byte[] bArr = AbstractC10220e.ad;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.f28023e.readInt() & Alert.DURATION_SHOW_INDEFINITELY;
        List advert = advert(AbstractC4265e.startapp(i - 4, i2, i4), i4, i2, i3);
        C10142e c10142e = (C10142e) c12056e.f24161e;
        synchronized (c10142e) {
            if (c10142e.f20070e.contains(Integer.valueOf(readInt))) {
                c10142e.inmobi(readInt, 2);
                return;
            }
            c10142e.f20070e.add(Integer.valueOf(readInt));
            C10497e.metrica(c10142e.f20075e, c10142e.f20059e + '[' + readInt + "] onRequest", 0L, new C7529e(c10142e, readInt, advert), 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [eِٖۢ, java.lang.Object] */
    public final void license(C12056e c12056e, int i, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.f28023e.readByte();
            byte[] bArr = AbstractC10220e.ad;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int startapp = AbstractC4265e.startapp(i, i2, i4);
        InterfaceC4895e interfaceC4895e = this.f28023e;
        C10142e c10142e = (C10142e) c12056e.f24161e;
        if (i3 == 0 || (i3 & 1) != 0) {
            C10420e license = c10142e.license(i3);
            if (license == null) {
                ((C10142e) c12056e.f24161e).inmobi(i3, 2);
                long j = startapp;
                ((C10142e) c12056e.f24161e).Signature(j);
                interfaceC4895e.skip(j);
            } else {
                TimeZone timeZone = AbstractC16286e.ad;
                C2777e c2777e = license.f20598e;
                long j2 = startapp;
                c2777e.getClass();
                long j3 = j2;
                while (true) {
                    if (j3 <= 0) {
                        z = z4;
                        C10420e c10420e = c2777e.f6694e;
                        TimeZone timeZone2 = AbstractC16286e.ad;
                        c10420e.f20597e.Signature(j2);
                        c2777e.f6694e.f20597e.f20067e.getClass();
                        break;
                    }
                    synchronized (c2777e.f6694e) {
                        z2 = c2777e.f6691e;
                        z = z4;
                        z3 = c2777e.f6692e.f31731e + j3 > c2777e.f6693e;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z3) {
                        interfaceC4895e.skip(j3);
                        c2777e.f6694e.appmetrica(4);
                        break;
                    }
                    if (z2) {
                        interfaceC4895e.skip(j3);
                        break;
                    }
                    long signatures = interfaceC4895e.signatures(c2777e.f6690e, j3);
                    if (signatures == -1) {
                        throw new EOFException();
                    }
                    j3 -= signatures;
                    C10420e c10420e2 = c2777e.f6694e;
                    synchronized (c10420e2) {
                        try {
                            if (c2777e.f6689e) {
                                c2777e.f6690e.ad();
                            } else {
                                C16151e c16151e = c2777e.f6692e;
                                boolean z5 = c16151e.f31731e == 0;
                                c16151e.mo2629class(c2777e.f6690e);
                                if (z5) {
                                    c10420e2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z4 = z;
                }
                if (z) {
                    license.startapp(C15793e.f31108e, true);
                }
            }
        } else {
            ?? obj = new Object();
            long j4 = startapp;
            interfaceC4895e.admob(j4);
            interfaceC4895e.signatures(obj, j4);
            C10497e.metrica(c10142e.f20075e, c10142e.f20059e + '[' + i3 + "] onData", 0L, new C10256e(c10142e, i3, obj, startapp, z4), 6);
        }
        this.f28023e.skip(i4);
    }

    public final void loadAd(C12056e c12056e, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i5 = 0;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.f28023e.readByte();
            byte[] bArr = AbstractC10220e.ad;
            i5 = readByte & 255;
        }
        if ((i2 & 32) != 0) {
            InterfaceC4895e interfaceC4895e = this.f28023e;
            interfaceC4895e.readInt();
            interfaceC4895e.readByte();
            byte[] bArr2 = AbstractC10220e.ad;
            i4 = i - 5;
        } else {
            i4 = i;
        }
        List advert = advert(AbstractC4265e.startapp(i4, i2, i5), i5, i2, i3);
        C10142e c10142e = (C10142e) c12056e.f24161e;
        if (i3 != 0 && (i3 & 1) == 0) {
            C10497e.metrica(c10142e.f20075e, c10142e.f20059e + '[' + i3 + "] onHeaders", 0L, new C7529e(c10142e, i3, advert, z), 6);
            return;
        }
        synchronized (c10142e) {
            C10420e license = c10142e.license(i3);
            if (license != null) {
                Unit unit = Unit.INSTANCE;
                license.startapp(AbstractC16286e.yandex(advert), z);
                return;
            }
            if (c10142e.f20079e) {
                return;
            }
            if (i3 <= c10142e.f20073e) {
                return;
            }
            if (i3 % 2 == c10142e.f20056e % 2) {
                return;
            }
            C10420e c10420e = new C10420e(i3, c10142e, false, z, AbstractC16286e.yandex(advert));
            c10142e.f20073e = i3;
            c10142e.f20064e.put(Integer.valueOf(i3), c10420e);
            C10497e.metrica(c10142e.f20078e.license(), c10142e.f20059e + '[' + i3 + "] onStream", 0L, new C5625e(c10142e, c10420e, 17), 6);
        }
    }

    public final void purchase(C12056e c12056e, int i, int i2) {
        int i3;
        Object[] array;
        if (i < 8) {
            throw new IOException(AbstractC1786e.admob(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f28023e.readInt();
        int readInt2 = this.f28023e.readInt();
        int i4 = i - 8;
        int[] m2468interface = AbstractC8703e.m2468interface(14);
        int length = m2468interface.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i3 = 0;
                break;
            }
            i3 = m2468interface[i5];
            if (AbstractC8703e.m2467class(i3) == readInt2) {
                break;
            } else {
                i5++;
            }
        }
        if (i3 == 0) {
            throw new IOException(AbstractC1786e.admob(readInt2, "TYPE_GOAWAY unexpected error code: "));
        }
        C0193e c0193e = C0193e.f1409e;
        if (i4 > 0) {
            c0193e = this.f28023e.isPro(i4);
        }
        c0193e.license();
        C10142e c10142e = (C10142e) c12056e.f24161e;
        synchronized (c10142e) {
            array = c10142e.f20064e.values().toArray(new C10420e[0]);
            c10142e.f20079e = true;
            Unit unit = Unit.INSTANCE;
        }
        for (C10420e c10420e : (C10420e[]) array) {
            if (c10420e.f20602e > readInt && c10420e.billing()) {
                c10420e.mopub(8);
                ((C10142e) c12056e.f24161e).advert(c10420e.f20602e);
            }
        }
    }
}
