package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11378e extends AbstractC15654e implements InterfaceC16252e, InterfaceC3761e {
    public final Constructor ad;

    public C11378e(Constructor constructor) {
        this.ad = constructor;
    }

    @Override // defpackage.AbstractC15654e
    public final Member ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC3761e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.ad.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C0317e(typeVariable));
        }
        return arrayList;
    }
}
