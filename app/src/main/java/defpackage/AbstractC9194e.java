package defpackage;

import androidx.recyclerview.widget.startapp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9194e extends AbstractC9870e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final String f18366e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public final InterfaceC1686e f18367e;

    public AbstractC9194e(String str, InterfaceC1686e interfaceC1686e) {
        this.f18366e = str;
        this.f18367e = interfaceC1686e;
    }

    @Override // defpackage.AbstractC9870e, defpackage.AbstractC10716e
    /* renamed from: break */
    public String mo1348break() {
        return this.f18366e;
    }

    @Override // defpackage.AbstractC9870e
    /* renamed from: else */
    public Object mo1405else(List list, InterfaceC5083e interfaceC5083e) {
        ArrayList arrayList = this.f8223e;
        arrayList.addAll(list);
        boolean z = false;
        if (!mo214finally() && !list.isEmpty()) {
            z = true;
        }
        this.f8237e = z;
        startapp startappVar = this.f8233e;
        if (startappVar == null) {
            startappVar = null;
        }
        ((C11268e) startappVar).firebase(arrayList);
        return Unit.INSTANCE;
    }

    /* renamed from: finally */
    public boolean mo214finally() {
        return !(this instanceof C18311e);
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: new */
    public void mo1389new() {
        this.f8223e.clear();
        startapp startappVar = this.f8233e;
        if (startappVar == null) {
            startappVar = null;
        }
        ((C11268e) startappVar).firebase(null);
    }

    @Override // defpackage.AbstractC9870e
    /* renamed from: return */
    public Object mo215return(int i, InterfaceC5083e interfaceC5083e) {
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC5336e.advert(ExecutorC3603e.f8134e, new C15238e(this, null, 6), interfaceC5083e);
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: switch, reason: not valid java name and merged with bridge method [inline-methods] */
    public C11268e mo1386final() {
        InterfaceC1686e interfaceC1686e = this.f18367e;
        if (interfaceC1686e instanceof C14611e) {
            interfaceC1686e = null;
        }
        return new C11268e(false, false, 0, interfaceC1686e, new Cvolatile(0, this, AbstractC9194e.class, "getCustomMenuItem", "getCustomMenuItem()Lkotlin/Pair;", 0, 0, 26), null, 103);
    }

    /* renamed from: throws, reason: not valid java name */
    public C6571e mo2531throws() {
        return null;
    }

    @Override // defpackage.AbstractC3655e, defpackage.AbstractC10716e
    /* renamed from: try */
    public AbstractC18491e mo216try() {
        return new C17256e(this, true, false, 124);
    }
}
