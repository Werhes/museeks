package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10721e extends AbstractC15168e {
    public final C7130e metrica;
    public final InterfaceC7227e vip;

    public C10721e(InterfaceC7227e interfaceC7227e, InterfaceC5372e interfaceC5372e) {
        super(interfaceC5372e);
        this.vip = interfaceC7227e;
        this.metrica = new C7130e(interfaceC5372e.appmetrica(), 0);
    }

    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // defpackage.AbstractC15168e
    public final void amazon(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC16956e
    public final int billing(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.AbstractC16956e
    public final Object purchase() {
        return new ArrayList();
    }

    @Override // defpackage.AbstractC16956e
    public final Object smaato(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) ((InterfaceC18155e) this.vip).subs(), arrayList.size()));
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // defpackage.AbstractC16956e
    public final Iterator yandex(Object obj) {
        return new C1630e(1, (Object[]) obj);
    }
}
