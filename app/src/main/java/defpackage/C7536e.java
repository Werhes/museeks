package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۢٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7536e {
    public static final C0381e appmetrica;
    public static final C0381e license;
    public int metrica;
    public final ArrayList ad = new ArrayList();
    public int vip = 0;

    static {
        C6594e c6594e = new C6594e(28, new C18142e(':', 0));
        C8382e c8382e = C8382e.f17147e;
        license = new C0381e(c6594e, false, (AbstractC7723e) c8382e, Alert.DURATION_SHOW_INDEFINITELY);
        appmetrica = new C0381e(new C6594e(28, new C18142e('*', 0)), false, (AbstractC7723e) c8382e, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
