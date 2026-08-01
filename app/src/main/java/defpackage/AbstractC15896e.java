package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15896e implements InterfaceC9660e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f31330e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f31331e = new ArrayList(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C2435e f31332e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f31333e;

    public AbstractC15896e(boolean z) {
        this.f31333e = z;
    }

    public final void Signature() {
        C2435e c2435e = this.f31332e;
        String str = AbstractC9413e.ad;
        for (int i = 0; i < this.f31330e; i++) {
            InterfaceC4407e interfaceC4407e = (InterfaceC4407e) this.f31331e.get(i);
            boolean z = this.f31333e;
            C10573e c10573e = (C10573e) interfaceC4407e;
            synchronized (c10573e) {
                try {
                    C1410e c1410e = C10573e.Signature;
                    if (z && (c2435e.startapp & 8) != 8) {
                        AbstractC2301e.subscription(c10573e.billing > 0);
                        c10573e.license.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (elapsedRealtime - c10573e.yandex);
                        c10573e.adcel += i2;
                        long j = c10573e.mopub;
                        long j2 = c10573e.startapp;
                        c10573e.mopub = j + j2;
                        if (i2 > 0) {
                            c10573e.purchase.ad((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i2);
                            if (c10573e.adcel < 2000) {
                                if (c10573e.mopub >= 524288) {
                                }
                                c10573e.vip(i2, c10573e.startapp, c10573e.advert);
                                c10573e.yandex = elapsedRealtime;
                                c10573e.startapp = 0L;
                            }
                            c10573e.advert = c10573e.purchase.startapp();
                            c10573e.vip(i2, c10573e.startapp, c10573e.advert);
                            c10573e.yandex = elapsedRealtime;
                            c10573e.startapp = 0L;
                        }
                        c10573e.billing--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f31332e = null;
    }

    public final void admob() {
        for (int i = 0; i < this.f31330e; i++) {
            ((InterfaceC4407e) this.f31331e.get(i)).getClass();
        }
    }

    @Override // defpackage.InterfaceC9660e
    public Map advert() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        ArrayList arrayList = this.f31331e;
        if (arrayList.contains(interfaceC4407e)) {
            return;
        }
        arrayList.add(interfaceC4407e);
        this.f31330e++;
    }

    public final void mopub(int i) {
        C2435e c2435e = this.f31332e;
        String str = AbstractC9413e.ad;
        for (int i2 = 0; i2 < this.f31330e; i2++) {
            InterfaceC4407e interfaceC4407e = (InterfaceC4407e) this.f31331e.get(i2);
            boolean z = this.f31333e;
            C10573e c10573e = (C10573e) interfaceC4407e;
            synchronized (c10573e) {
                C1410e c1410e = C10573e.Signature;
                if (z && (c2435e.startapp & 8) != 8) {
                    c10573e.startapp += i;
                }
            }
        }
    }

    public final void subscription(C2435e c2435e) {
        this.f31332e = c2435e;
        for (int i = 0; i < this.f31330e; i++) {
            InterfaceC4407e interfaceC4407e = (InterfaceC4407e) this.f31331e.get(i);
            boolean z = this.f31333e;
            C10573e c10573e = (C10573e) interfaceC4407e;
            synchronized (c10573e) {
                try {
                    C1410e c1410e = C10573e.Signature;
                    if (z && (c2435e.startapp & 8) != 8) {
                        if (c10573e.billing == 0) {
                            c10573e.license.getClass();
                            c10573e.yandex = SystemClock.elapsedRealtime();
                        }
                        c10573e.billing++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
