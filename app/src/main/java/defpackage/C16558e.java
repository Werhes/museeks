package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۠ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16558e implements InterfaceC14469e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f32484e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final Set f32485e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ArrayList f32486e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5609e f32487e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C0444e f32488e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public byte[] f32489e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final Set f32490e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C13905e f32491e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12582e f32492e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C13905e f32493e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f32494e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public InterfaceC8296e f32495e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C18540e f32496e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final long f32497e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C5350e f32498e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public Looper f32499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final HashMap f32500e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public volatile HandlerC17797e f32501e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5401e f32502e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final UUID f32503e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f32504e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f32505e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Handler f32506e;

    public C16558e(UUID uuid, C5609e c5609e, HashMap hashMap, boolean z, int[] iArr, boolean z2, C5401e c5401e) {
        uuid.getClass();
        AbstractC2301e.yandex(!AbstractC18394e.metrica.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f32503e = uuid;
        this.f32492e = C16961e.f33216e;
        this.f32487e = c5609e;
        this.f32500e = hashMap;
        this.f32484e = z;
        this.f32505e = iArr;
        this.f32504e = z2;
        this.f32502e = c5401e;
        this.f32496e = new C18540e(14);
        this.f32488e = new C0444e(this);
        this.f32486e = new ArrayList();
        this.f32485e = Collections.newSetFromMap(new IdentityHashMap());
        this.f32490e = Collections.newSetFromMap(new IdentityHashMap());
        this.f32497e = 300000L;
    }

    public static ArrayList purchase(C9284e c9284e, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c9284e.f18506e);
        for (int i = 0; i < c9284e.f18506e; i++) {
            C14290e c14290e = c9284e.f18507e[i];
            if ((c14290e.ad(uuid) || (AbstractC18394e.license.equals(uuid) && c14290e.ad(AbstractC18394e.metrica))) && (c14290e.f28262e != null || z)) {
                arrayList.add(c14290e);
            }
        }
        return arrayList;
    }

    public static boolean vip(C13905e c13905e) {
        c13905e.loadAd();
        if (c13905e.Signature != 1) {
            return false;
        }
        C7923e purchase = c13905e.purchase();
        purchase.getClass();
        Throwable cause = purchase.getCause();
        return (cause instanceof ResourceBusyException) || AbstractC2413e.purchase(cause);
    }

    public final InterfaceC16612e ad(Looper looper, C15683e c15683e, C16975e c16975e, boolean z) {
        ArrayList arrayList;
        if (this.f32501e == null) {
            this.f32501e = new HandlerC17797e(this, looper, 2);
        }
        C9284e c9284e = c16975e.remoteconfig;
        int i = 0;
        C13905e c13905e = null;
        if (c9284e == null) {
            int yandex = AbstractC8542e.yandex(c16975e.loadAd);
            InterfaceC8296e interfaceC8296e = this.f32495e;
            interfaceC8296e.getClass();
            if (interfaceC8296e.isVip() != 2 || !C2848e.metrica) {
                int[] iArr = this.f32505e;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == yandex) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && interfaceC8296e.isVip() != 1) {
                    C13905e c13905e2 = this.f32493e;
                    if (c13905e2 == null) {
                        C2171e c2171e = AbstractC17475e.f34223e;
                        C13905e appmetrica = appmetrica(C1410e.f4222e, true, null, z);
                        this.f32486e.add(appmetrica);
                        this.f32493e = appmetrica;
                    } else {
                        c13905e2.license(null);
                    }
                    return this.f32493e;
                }
            }
            return null;
        }
        if (this.f32489e == null) {
            arrayList = purchase(c9284e, this.f32503e, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f32503e);
                AbstractC2803e.billing("DefaultDrmSessionMgr", "DRM error", exc);
                c15683e.license(exc);
                return new C12134e(new C7923e(exc, 6003));
            }
        } else {
            arrayList = null;
        }
        if (this.f32484e) {
            Iterator it = this.f32486e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C13905e c13905e3 = (C13905e) it.next();
                if (Objects.equals(c13905e3.ad, arrayList)) {
                    c13905e = c13905e3;
                    break;
                }
            }
        } else {
            c13905e = this.f32491e;
        }
        if (c13905e != null) {
            c13905e.license(c15683e);
            return c13905e;
        }
        C13905e appmetrica2 = appmetrica(arrayList, false, c15683e, z);
        if (!this.f32484e) {
            this.f32491e = appmetrica2;
        }
        this.f32486e.add(appmetrica2);
        return appmetrica2;
    }

    public final C13905e appmetrica(List list, boolean z, C15683e c15683e, boolean z2) {
        C13905e metrica = metrica(list, z, c15683e);
        boolean vip = vip(metrica);
        long j = this.f32497e;
        Set set = this.f32490e;
        if (vip && !set.isEmpty()) {
            AbstractC7014e it = AbstractC12614e.admob(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC16612e) it.next()).metrica(null);
            }
            metrica.metrica(c15683e);
            if (j != -9223372036854775807L) {
                metrica.metrica(null);
            }
            metrica = metrica(list, z, c15683e);
        }
        if (vip(metrica) && z2) {
            Set set2 = this.f32485e;
            if (!set2.isEmpty()) {
                AbstractC7014e it2 = AbstractC12614e.admob(set2).iterator();
                while (it2.hasNext()) {
                    ((C4029e) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    AbstractC7014e it3 = AbstractC12614e.admob(set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC16612e) it3.next()).metrica(null);
                    }
                }
                metrica.metrica(c15683e);
                if (j != -9223372036854775807L) {
                    metrica.metrica(null);
                }
                return metrica(list, z, c15683e);
            }
        }
        return metrica;
    }

    public final void billing() {
        if (this.f32495e != null && this.f32494e == 0 && this.f32486e.isEmpty() && this.f32485e.isEmpty()) {
            InterfaceC8296e interfaceC8296e = this.f32495e;
            interfaceC8296e.getClass();
            interfaceC8296e.release();
            this.f32495e = null;
        }
    }

    @Override // defpackage.InterfaceC14469e
    /* renamed from: eؑۥؘ */
    public final int mo2038e(C16975e c16975e) {
        startapp(false);
        InterfaceC8296e interfaceC8296e = this.f32495e;
        interfaceC8296e.getClass();
        int isVip = interfaceC8296e.isVip();
        C9284e c9284e = c16975e.remoteconfig;
        if (c9284e == null) {
            int yandex = AbstractC8542e.yandex(c16975e.loadAd);
            int i = 0;
            while (true) {
                int[] iArr = this.f32505e;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == yandex) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f32489e == null) {
            UUID uuid = this.f32503e;
            if (purchase(c9284e, uuid, true).isEmpty()) {
                if (c9284e.f18506e == 1 && c9284e.f18507e[0].ad(AbstractC18394e.metrica)) {
                    AbstractC2803e.smaato("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c9284e.f18504e;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return isVip;
    }

    @Override // defpackage.InterfaceC14469e
    public final void license() {
        InterfaceC8296e c1400e;
        startapp(true);
        int i = this.f32494e;
        this.f32494e = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f32495e == null) {
            UUID uuid = this.f32503e;
            this.f32492e.getClass();
            try {
                try {
                    c1400e = new C16961e(uuid);
                } catch (C13545e unused) {
                    AbstractC2803e.purchase("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    c1400e = new C1400e(29);
                }
                this.f32495e = c1400e;
                c1400e.pro(new C6325e(9, this));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new Exception(e);
            } catch (Exception e2) {
                throw new Exception(e2);
            }
        }
        if (this.f32497e == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f32486e;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C13905e) arrayList.get(i2)).license(null);
            i2++;
        }
    }

    public final C13905e metrica(List list, boolean z, C15683e c15683e) {
        this.f32495e.getClass();
        boolean z2 = this.f32504e | z;
        InterfaceC8296e interfaceC8296e = this.f32495e;
        byte[] bArr = this.f32489e;
        Looper looper = this.f32499e;
        looper.getClass();
        C5350e c5350e = this.f32498e;
        c5350e.getClass();
        C13905e c13905e = new C13905e(this.f32503e, interfaceC8296e, this.f32496e, this.f32488e, list, z2, z, bArr, this.f32500e, this.f32487e, looper, this.f32502e, c5350e);
        c13905e.license(c15683e);
        if (this.f32497e != -9223372036854775807L) {
            c13905e.license(null);
        }
        return c13905e;
    }

    @Override // defpackage.InterfaceC14469e
    public final void release() {
        startapp(true);
        int i = this.f32494e - 1;
        this.f32494e = i;
        if (i != 0) {
            return;
        }
        if (this.f32497e != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f32486e);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C13905e) arrayList.get(i2)).metrica(null);
            }
        }
        AbstractC7014e it = AbstractC12614e.admob(this.f32485e).iterator();
        while (it.hasNext()) {
            ((C4029e) it.next()).release();
        }
        billing();
    }

    public final void startapp(boolean z) {
        if (z && this.f32499e == null) {
            AbstractC2803e.amazon("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f32499e;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            AbstractC2803e.amazon("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f32499e.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.InterfaceC14469e
    public final InterfaceC11751e tapsense(C15683e c15683e, C16975e c16975e) {
        AbstractC2301e.subscription(this.f32494e > 0);
        this.f32499e.getClass();
        C4029e c4029e = new C4029e(this, c15683e);
        Handler handler = this.f32506e;
        handler.getClass();
        handler.post(new RunnableC16019e(c4029e, c16975e, 29));
        return c4029e;
    }

    @Override // defpackage.InterfaceC14469e
    /* renamed from: transient */
    public final void mo2041transient(Looper looper, C5350e c5350e) {
        synchronized (this) {
            try {
                Looper looper2 = this.f32499e;
                if (looper2 == null) {
                    this.f32499e = looper;
                    this.f32506e = new Handler(looper);
                } else {
                    AbstractC2301e.subscription(looper2 == looper);
                    this.f32506e.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32498e = c5350e;
    }

    @Override // defpackage.InterfaceC14469e
    public final InterfaceC16612e yandex(C15683e c15683e, C16975e c16975e) {
        startapp(false);
        AbstractC2301e.subscription(this.f32494e > 0);
        this.f32499e.getClass();
        return ad(this.f32499e, c15683e, c16975e, true);
    }
}
