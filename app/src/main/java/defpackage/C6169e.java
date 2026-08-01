package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6169e implements InterfaceC5178e {
    public final View ad;

    public C6169e(View view) {
        this.ad = view;
    }

    public final void ad(int i) {
        int i2 = 16;
        if (i != 16) {
            i2 = 6;
            if (i != 6) {
                i2 = 13;
                if (i != 13) {
                    i2 = 23;
                    if (i != 23) {
                        i2 = 3;
                        if (i != 3) {
                            if (i == 0) {
                                i2 = 0;
                            } else {
                                i2 = 17;
                                if (i != 17) {
                                    i2 = 27;
                                    if (i != 27) {
                                        i2 = 26;
                                        if (i != 26) {
                                            i2 = 9;
                                            if (i != 9) {
                                                i2 = 22;
                                                if (i != 22) {
                                                    i2 = 21;
                                                    if (i != 21) {
                                                        i2 = 1;
                                                        if (i != 1) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        int billing = AbstractC17957e.billing(i2);
        if (billing == -1) {
            return;
        }
        this.ad.performHapticFeedback(billing);
    }
}
