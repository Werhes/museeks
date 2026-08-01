package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5918e implements InterfaceC2209e {
    public int ad;
    public final ArrayList vip;

    public AbstractC5918e(int i, int i2) {
        this.ad = (i2 & 1) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : i;
        this.vip = new ArrayList();
    }

    public final String license() {
        return AbstractC7762e.smaato(new C2167e(new C1356e(6, AbstractC13480e.m3608try(this.vip, ",\n", null, null, null, 62)), new C4671e(3)), "\n");
    }
}
