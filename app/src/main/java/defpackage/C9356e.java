package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9356e implements InterfaceC6034e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f18620e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f18621e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18622e;

    public /* synthetic */ C9356e(ArrayList arrayList, InterfaceC3314e interfaceC3314e, int i) {
        this.f18622e = i;
        this.f18621e = arrayList;
        this.f18620e = interfaceC3314e;
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        switch (this.f18622e) {
            case 0:
                InterfaceC13352e interfaceC13352e = (InterfaceC13352e) obj;
                boolean z = interfaceC13352e instanceof C14483e;
                ArrayList arrayList = this.f18621e;
                if (z) {
                    arrayList.add(interfaceC13352e);
                } else if (interfaceC13352e instanceof C18112e) {
                    arrayList.remove(((C18112e) interfaceC13352e).ad);
                }
                this.f18620e.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.INSTANCE;
            case 1:
                InterfaceC13352e interfaceC13352e2 = (InterfaceC13352e) obj;
                boolean z2 = interfaceC13352e2 instanceof C3877e;
                ArrayList arrayList2 = this.f18621e;
                if (z2) {
                    arrayList2.add(interfaceC13352e2);
                } else if (interfaceC13352e2 instanceof C7026e) {
                    arrayList2.remove(((C7026e) interfaceC13352e2).ad);
                } else if (interfaceC13352e2 instanceof C3005e) {
                    arrayList2.remove(((C3005e) interfaceC13352e2).ad);
                }
                this.f18620e.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                return Unit.INSTANCE;
            case 2:
                InterfaceC13352e interfaceC13352e3 = (InterfaceC13352e) obj;
                boolean z3 = interfaceC13352e3 instanceof C16906e;
                ArrayList arrayList3 = this.f18621e;
                if (z3) {
                    arrayList3.add(interfaceC13352e3);
                } else if (interfaceC13352e3 instanceof C2574e) {
                    arrayList3.remove(((C2574e) interfaceC13352e3).ad);
                }
                this.f18620e.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                return Unit.INSTANCE;
            default:
                InterfaceC13352e interfaceC13352e4 = (InterfaceC13352e) obj;
                boolean z4 = interfaceC13352e4 instanceof C17612e;
                ArrayList arrayList4 = this.f18621e;
                if (z4) {
                    arrayList4.add(interfaceC13352e4);
                } else if (interfaceC13352e4 instanceof C3103e) {
                    arrayList4.remove(((C3103e) interfaceC13352e4).ad);
                } else if (interfaceC13352e4 instanceof C1867e) {
                    arrayList4.remove(((C1867e) interfaceC13352e4).ad);
                }
                this.f18620e.setValue(Boolean.valueOf(!arrayList4.isEmpty()));
                return Unit.INSTANCE;
        }
    }
}
