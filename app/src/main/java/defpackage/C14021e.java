package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leٖۣٓ;", "Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "Leٌٓؔ;", "<init>", "()V", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: eٖۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14021e extends C13861e implements DynamicMutableRealmObject {
    @Override // defpackage.C13861e, defpackage.InterfaceC16120e
    public final InterfaceC17101e Signature(String str) {
        return ad(AbstractC3820e.ad.vip(DynamicMutableRealmObject.class), str);
    }

    @Override // defpackage.C13861e
    public final C9889e ad(InterfaceC7227e interfaceC7227e, String str) {
        return C12575e.admob(this.f27457e, str, interfaceC7227e, false, true);
    }

    @Override // defpackage.C13861e, defpackage.InterfaceC16120e
    public final Object admob(InterfaceC7227e interfaceC7227e, String str) {
        return C12575e.Signature(this.f27457e, str, interfaceC7227e, false, true);
    }

    @Override // defpackage.C13861e, defpackage.InterfaceC16120e
    public final Object ads(InterfaceC7227e interfaceC7227e, String str) {
        return C12575e.Signature(this.f27457e, str, interfaceC7227e, true, true);
    }

    @Override // io.realm.kotlin.dynamic.DynamicMutableRealmObject
    public final DynamicMutableRealmObject smaato(Object obj, String str) {
        C12575e.subscription(this.f27457e, str, obj, 2, new LinkedHashMap());
        return this;
    }

    @Override // defpackage.C13861e, defpackage.InterfaceC16120e
    public final InterfaceC16120e startapp(String str) {
        return (DynamicMutableRealmObject) ads(AbstractC3820e.ad.vip(DynamicMutableRealmObject.class), str);
    }
}
