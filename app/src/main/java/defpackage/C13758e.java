package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13758e extends AbstractC15168e {
    public final AbstractC6439e metrica;
    public final /* synthetic */ int vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13758e(InterfaceC5372e interfaceC5372e, int i) {
        super(interfaceC5372e);
        this.vip = i;
        switch (i) {
            case 1:
                super(interfaceC5372e);
                this.metrica = new C7130e(interfaceC5372e.appmetrica(), 2);
                return;
            case 2:
                super(interfaceC5372e);
                this.metrica = new C7130e(interfaceC5372e.appmetrica(), 3);
                return;
            default:
                this.metrica = new C7130e(interfaceC5372e.appmetrica(), 1);
                return;
        }
    }

    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        switch (this.vip) {
            case 0:
                return new ArrayList((Collection) null);
            case 1:
                return new HashSet((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.AbstractC15168e
    public final void amazon(int i, Object obj, Object obj2) {
        switch (this.vip) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                return;
            case 1:
                ((HashSet) obj).add(obj2);
                return;
            default:
                ((LinkedHashSet) obj).add(obj2);
                return;
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        switch (this.vip) {
            case 0:
                return (C7130e) this.metrica;
            case 1:
                return (C7130e) this.metrica;
            default:
                return (C7130e) this.metrica;
        }
    }

    @Override // defpackage.AbstractC16956e
    public final int billing(Object obj) {
        switch (this.vip) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
                return ((HashSet) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // defpackage.AbstractC16956e
    public final Object purchase() {
        switch (this.vip) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.AbstractC16956e
    public final Object smaato(Object obj) {
        switch (this.vip) {
            case 0:
                return (ArrayList) obj;
            case 1:
                return (HashSet) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // defpackage.AbstractC16956e
    public final Iterator yandex(Object obj) {
        return ((Collection) obj).iterator();
    }
}
