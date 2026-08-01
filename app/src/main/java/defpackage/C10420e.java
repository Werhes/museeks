package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٞۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10420e implements InterfaceC17357e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f20592e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public IOException f20593e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f20594e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C18451e f20595e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C6880e f20596e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10142e f20597e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2777e f20598e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C6880e f20599e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f20600e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C7348e f20601e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f20602e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f20603e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayDeque f20604e;

    public C10420e(int i, C10142e c10142e, boolean z, boolean z2, C15793e c15793e) {
        this.f20602e = i;
        this.f20597e = c10142e;
        this.f20595e = new C18451e(i);
        this.f20592e = c10142e.f20063e.ad();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f20604e = arrayDeque;
        this.f20598e = new C2777e(this, c10142e.f20065e.ad(), z2);
        this.f20601e = new C7348e(this, z);
        this.f20596e = new C6880e(this);
        this.f20599e = new C6880e(this);
        if (c15793e == null) {
            if (!billing()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (billing()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c15793e);
        }
    }

    public final void ad() {
        boolean z;
        boolean yandex;
        TimeZone timeZone = AbstractC16286e.ad;
        synchronized (this) {
            try {
                C2777e c2777e = this.f20598e;
                if (!c2777e.f6691e && c2777e.f6689e) {
                    C7348e c7348e = this.f20601e;
                    if (!c7348e.f15082e) {
                        if (c7348e.f15079e) {
                        }
                    }
                    z = true;
                    yandex = yandex();
                    Unit unit = Unit.INSTANCE;
                }
                z = false;
                yandex = yandex();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            metrica(9, null);
        } else {
            if (yandex) {
                return;
            }
            this.f20597e.advert(this.f20602e);
        }
    }

    @Override // defpackage.InterfaceC17357e
    public final InterfaceC2537e adcel() {
        return this.f20598e;
    }

    public final void appmetrica(int i) {
        if (license(i, null)) {
            this.f20597e.inmobi(this.f20602e, i);
        }
    }

    public final boolean billing() {
        boolean z = (this.f20602e & 1) == 1;
        this.f20597e.getClass();
        return true == z;
    }

    @Override // defpackage.InterfaceC17357e
    public final void cancel() {
        appmetrica(9);
    }

    public final boolean license(int i, IOException iOException) {
        TimeZone timeZone = AbstractC16286e.ad;
        synchronized (this) {
            if (purchase() != 0) {
                return false;
            }
            this.f20594e = i;
            this.f20593e = iOException;
            notifyAll();
            if (this.f20598e.f6691e && this.f20601e.f15082e) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.f20597e.advert(this.f20602e);
            return true;
        }
    }

    public final void metrica(int i, IOException iOException) {
        if (license(i, iOException)) {
            this.f20597e.f20074e.isVip(this.f20602e, i);
        }
    }

    public final void mopub(int i) {
        synchronized (this) {
            try {
                if (purchase() == 0) {
                    this.f20594e = i;
                    notifyAll();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int purchase() {
        int i;
        synchronized (this) {
            i = this.f20594e;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:11:0x0019, B:13:0x002a, B:14:0x002e, B:22:0x0021), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(defpackage.C15793e r3, boolean r4) {
        /*
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC16286e.ad
            monitor-enter(r2)
            boolean r0 = r2.f20603e     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == 0) goto L21
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.appmetrica(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.appmetrica(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L19
            goto L21
        L19:
            eّؔۖ r3 = r2.f20598e     // Catch: java.lang.Throwable -> L1f
            r3.getClass()     // Catch: java.lang.Throwable -> L1f
            goto L28
        L1f:
            r3 = move-exception
            goto L42
        L21:
            r2.f20603e = r1     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque r0 = r2.f20604e     // Catch: java.lang.Throwable -> L1f
            r0.add(r3)     // Catch: java.lang.Throwable -> L1f
        L28:
            if (r4 == 0) goto L2e
            eّؔۖ r3 = r2.f20598e     // Catch: java.lang.Throwable -> L1f
            r3.f6691e = r1     // Catch: java.lang.Throwable -> L1f
        L2e:
            boolean r3 = r2.yandex()     // Catch: java.lang.Throwable -> L1f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1f
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)
            if (r3 != 0) goto L41
            eًَْ r3 = r2.f20597e
            int r4 = r2.f20602e
            r3.advert(r4)
        L41:
            return
        L42:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10420e.startapp(eٕۡۡ, boolean):void");
    }

    @Override // defpackage.InterfaceC17357e
    public final InterfaceC0274e subs() {
        return this.f20601e;
    }

    public final void vip() {
        C7348e c7348e = this.f20601e;
        if (c7348e.f15079e) {
            throw new IOException("stream closed");
        }
        if (c7348e.f15082e) {
            throw new IOException("stream finished");
        }
        if (purchase() != 0) {
            IOException iOException = this.f20593e;
            if (iOException == null) {
                throw new C7651e(purchase());
            }
        }
    }

    public final boolean yandex() {
        synchronized (this) {
            try {
                if (purchase() != 0) {
                    return false;
                }
                C2777e c2777e = this.f20598e;
                if (!c2777e.f6691e) {
                    if (c2777e.f6689e) {
                    }
                    return true;
                }
                C7348e c7348e = this.f20601e;
                if (c7348e.f15082e || c7348e.f15079e) {
                    if (this.f20603e) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
