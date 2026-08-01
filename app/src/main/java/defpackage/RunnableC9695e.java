package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9695e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f19190e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6268e f19191e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19192e;

    public /* synthetic */ RunnableC9695e(C6268e c6268e, int i, int i2) {
        this.f19192e = i2;
        this.f19191e = c6268e;
        this.f19190e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19192e) {
            case 0:
                C6268e c6268e = this.f19191e;
                if (c6268e.mo2107e(25) || c6268e.mo2107e(33)) {
                    boolean mo2107e = c6268e.mo2107e(33);
                    int i = this.f19190e;
                    if (mo2107e) {
                        c6268e.mo2132package(i, 1);
                        return;
                    } else {
                        c6268e.mo2095e(i);
                        return;
                    }
                }
                return;
            default:
                C6268e c6268e2 = this.f19191e;
                if (c6268e2.mo2107e(26) || c6268e2.mo2107e(34)) {
                    int i2 = this.f19190e;
                    if (i2 == -100) {
                        if (c6268e2.mo2107e(34)) {
                            c6268e2.mo2137super(1, true);
                            return;
                        } else {
                            c6268e2.mo2086e(true);
                            return;
                        }
                    }
                    if (i2 == -1) {
                        if (c6268e2.mo2107e(34)) {
                            c6268e2.mo2111e(1);
                            return;
                        } else {
                            c6268e2.mo2136strictfp();
                            return;
                        }
                    }
                    if (i2 == 1) {
                        if (c6268e2.mo2107e(34)) {
                            c6268e2.mo2141transient(1);
                            return;
                        } else {
                            c6268e2.mo2118e();
                            return;
                        }
                    }
                    if (i2 == 100) {
                        if (c6268e2.mo2107e(34)) {
                            c6268e2.mo2137super(1, false);
                            return;
                        } else {
                            c6268e2.mo2086e(false);
                            return;
                        }
                    }
                    if (i2 != 101) {
                        AbstractC10257e.pro("onAdjustVolume: Ignoring unknown direction: ", i2, "VolumeProviderCompat");
                        return;
                    } else if (c6268e2.mo2107e(34)) {
                        c6268e2.mo2137super(1, !c6268e2.m2099e());
                        return;
                    } else {
                        c6268e2.mo2086e(!c6268e2.m2099e());
                        return;
                    }
                }
                return;
        }
    }
}
