package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC15170e extends AbstractBinderC16179e {
    public static final C18482e billing = new C18482e("AppVisibilityProxy", null);
    public static final int yandex = 1;
    public final Set appmetrica;
    public int purchase;

    public BinderC15170e() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 0);
        this.appmetrica = DesugarCollections.synchronizedSet(new HashSet());
        this.purchase = yandex;
    }
}
