package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٝۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1969e implements InterfaceC6440e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f5170e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C4524e f5171e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f5172e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f5173e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C1410e f5174e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5175e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int[] f5169e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16911e f5167e = new C16911e(new C7815e(27));

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C16911e f5168e = new C16911e(new C7815e(28));

    @Override // defpackage.InterfaceC6440e
    public final InterfaceC6440e ad(C4524e c4524e) {
        synchronized (this) {
            this.f5171e = c4524e;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r10v21, types: [eٍؕۛ, java.lang.Object] */
    public final void metrica(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C3328e());
                return;
            case 1:
                arrayList.add(new C3693e());
                return;
            case 2:
                arrayList.add(new C8362e(0));
                return;
            case 3:
                arrayList.add(new C0920e());
                return;
            case 4:
                InterfaceC1272e isVip = f5167e.isVip(0);
                if (isVip != null) {
                    arrayList.add(isVip);
                    return;
                } else {
                    arrayList.add(new C4710e());
                    return;
                }
            case 5:
                arrayList.add(new C13587e());
                return;
            case 6:
                arrayList.add(new C0518e(this.f5171e, this.f5172e ? 0 : 2));
                return;
            case 7:
                arrayList.add(new C0689e(0));
                return;
            case 8:
                C4524e c4524e = this.f5171e;
                int i2 = this.f5173e;
                int i3 = (i2 & 1) != 0 ? 64 : 0;
                if ((i2 & 2) != 0) {
                    i3 |= 128;
                }
                int i4 = (this.f5172e ? 0 : 32) | i3;
                C2171e c2171e = AbstractC17475e.f34223e;
                arrayList.add(new C15789e(c4524e, i4, null, C1410e.f4222e));
                C4524e c4524e2 = this.f5171e;
                int i5 = this.f5173e;
                int i6 = (i5 & 1) == 0 ? 0 : 32;
                if ((2 & i5) != 0) {
                    i6 |= 128;
                }
                arrayList.add(new C1919e(c4524e2, i6 | (this.f5172e ? 0 : 16)));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new C3484e());
                return;
            case 11:
                if (this.f5174e == null) {
                    C2171e c2171e2 = AbstractC17475e.f34223e;
                    this.f5174e = C1410e.f4222e;
                }
                arrayList.add(new C6928e(1, !this.f5172e ? 1 : 0, this.f5171e, new C8010e(0L), new C6233e(r2, this.f5174e)));
                return;
            case 12:
                ?? obj = new Object();
                obj.metrica = 0;
                obj.license = -1L;
                obj.purchase = -1;
                obj.billing = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C14853e(this.f5170e));
                return;
            case 15:
                InterfaceC1272e isVip2 = f5168e.isVip(new Object[0]);
                if (isVip2 != null) {
                    arrayList.add(isVip2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new C6051e(!this.f5172e ? 1 : 0, this.f5171e));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                arrayList.add(new C8535e(1));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                arrayList.add(new C2034e(1));
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                arrayList.add(new C8535e(0));
                return;
            case 20:
                arrayList.add(new C4055e(this.f5175e));
                return;
            case 21:
                arrayList.add(new C2034e(0));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // defpackage.InterfaceC6440e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.InterfaceC1272e[] mopub(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            int[] r1 = defpackage.C1969e.f5169e     // Catch: java.lang.Throwable -> L2f
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2f
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = defpackage.AbstractC8508e.license(r8)     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            if (r8 == r4) goto L31
            r6.metrica(r8, r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L55
        L31:
            int r7 = defpackage.AbstractC8508e.appmetrica(r7)     // Catch: java.lang.Throwable -> L2f
            if (r7 == r4) goto L3c
            if (r7 == r8) goto L3c
            r6.metrica(r7, r0)     // Catch: java.lang.Throwable -> L2f
        L3c:
            r4 = r3
        L3d:
            if (r4 >= r2) goto L4b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L2f
            if (r5 == r8) goto L48
            if (r5 == r7) goto L48
            r6.metrica(r5, r0)     // Catch: java.lang.Throwable -> L2f
        L48:
            int r4 = r4 + 1
            goto L3d
        L4b:
            eؒۘٝ[] r7 = new defpackage.InterfaceC1272e[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r7 = r0.toArray(r7)     // Catch: java.lang.Throwable -> L2f
            eؒۘٝ[] r7 = (defpackage.InterfaceC1272e[]) r7     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r6)
            return r7
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1969e.mopub(android.net.Uri, java.util.Map):eؒۘٝ[]");
    }

    @Override // defpackage.InterfaceC6440e
    public final InterfaceC6440e startapp(boolean z) {
        synchronized (this) {
            this.f5172e = z;
        }
        return this;
    }

    @Override // defpackage.InterfaceC6440e
    public final InterfaceC6440e vip(int i) {
        synchronized (this) {
            this.f5173e = i;
        }
        return this;
    }
}
