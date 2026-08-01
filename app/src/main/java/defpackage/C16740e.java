package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Leٗؓۦ;", "Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "Leَۚٗ;", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: eٗؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16740e implements DynamicMutableRealmObject, InterfaceC10518e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13655e f32811e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LinkedHashMap f32812e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f32813e;

    public C16740e(String str, Map map) {
        this.f32813e = str;
        this.f32812e = new LinkedHashMap(map);
    }

    @Override // defpackage.InterfaceC16120e
    public final InterfaceC17101e Signature(String str) {
        LinkedHashMap linkedHashMap = this.f32812e;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = AbstractC8116e.license(new DynamicMutableRealmObject[0]);
            linkedHashMap.put(str, obj);
        }
        return (InterfaceC17101e) obj;
    }

    @Override // defpackage.InterfaceC16120e
    public final Object admob(InterfaceC7227e interfaceC7227e, String str) {
        return this.f32812e.get(str);
    }

    @Override // defpackage.InterfaceC16120e
    public final Object ads(InterfaceC7227e interfaceC7227e, String str) {
        return this.f32812e.get(str);
    }

    @Override // defpackage.InterfaceC10518e
    public final void isVip(C13655e c13655e) {
        this.f32811e = c13655e;
    }

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF32811e() {
        return this.f32811e;
    }

    @Override // io.realm.kotlin.dynamic.DynamicMutableRealmObject
    public final DynamicMutableRealmObject smaato(Object obj, String str) {
        this.f32812e.put(str, obj);
        return this;
    }

    @Override // defpackage.InterfaceC16120e
    public final InterfaceC16120e startapp(String str) {
        return (DynamicMutableRealmObject) this.f32812e.get(str);
    }
}
