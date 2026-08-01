package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10938e {
    public final ArrayList ad = new ArrayList();
    public CarText metrica;
    public Action vip;

    public final Header ad() {
        if (CarText.isNullOrEmpty(this.metrica) && this.vip == null) {
            throw new IllegalStateException("Either the title or start header action must be set");
        }
        return new Header(this);
    }

    public final void vip(Action action) {
        C8778e c8778e = C8778e.advert;
        Objects.requireNonNull(action);
        c8778e.ad(Collections.singletonList(action));
        this.vip = action;
    }
}
