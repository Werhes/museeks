package defpackage;

import java.lang.reflect.Type;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12097e implements InterfaceC10361e {
    public final /* synthetic */ Type ad;
    public final /* synthetic */ C0947e vip;

    public C12097e(Type type, C0947e c0947e) {
        this.ad = type;
        this.vip = c0947e;
    }

    @Override // defpackage.InterfaceC10361e
    public final AbstractC13345e ad(Type type, Set set, C14172e c14172e) {
        if (!set.isEmpty()) {
            return null;
        }
        Set set2 = AbstractC7644e.ad;
        if (AbstractC18453e.metrica(this.ad, type)) {
            return this.vip;
        }
        return null;
    }
}
