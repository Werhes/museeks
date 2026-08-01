package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0236e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1482e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1483e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f1484e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f1485e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1486e;

    public /* synthetic */ C0236e(InterfaceC3314e interfaceC3314e, ArrayList arrayList, List list, boolean z, int i) {
        this.f1486e = i;
        this.f1484e = interfaceC3314e;
        this.f1483e = arrayList;
        this.f1485e = list;
        this.f1482e = z;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1486e;
        boolean z = this.f1482e;
        ?? r4 = this.f1485e;
        ArrayList arrayList = this.f1483e;
        InterfaceC3314e interfaceC3314e = this.f1484e;
        AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
        switch (i) {
            case 0:
                abstractC3698e.f8274e = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C6564e) arrayList.get(i2)).metrica(abstractC3698e, z);
                }
                int size2 = r4.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((C6564e) r4.get(i3)).metrica(abstractC3698e, z);
                }
                Unit unit = Unit.INSTANCE;
                abstractC3698e.f8274e = false;
                interfaceC3314e.getValue();
                return Unit.INSTANCE;
            default:
                abstractC3698e.f8274e = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((C3225e) arrayList.get(i4)).metrica(abstractC3698e, z);
                }
                int size4 = r4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((C3225e) r4.get(i5)).metrica(abstractC3698e, z);
                }
                Unit unit2 = Unit.INSTANCE;
                abstractC3698e.f8274e = false;
                interfaceC3314e.getValue();
                return Unit.INSTANCE;
        }
    }
}
