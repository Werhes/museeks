package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۦۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9912e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19553e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f19554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9912e(int i, ArrayList arrayList) {
        super(1);
        this.f19554e = i;
        this.f19553e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19554e) {
            case 0:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                ArrayList arrayList = this.f19553e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC3698e.advert(abstractC3698e, (AbstractC2832e) arrayList.get(i), 0, 0);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj;
                ArrayList arrayList2 = this.f19553e;
                int billing = AbstractC6874e.billing(arrayList2);
                if (billing >= 0) {
                    int i2 = 0;
                    while (true) {
                        AbstractC3698e.advert(abstractC3698e2, (AbstractC2832e) arrayList2.get(i2), 0, 0);
                        if (i2 != billing) {
                            i2++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC3698e abstractC3698e3 = (AbstractC3698e) obj;
                ArrayList arrayList3 = this.f19553e;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    abstractC3698e3.billing((AbstractC2832e) arrayList3.get(i3), 0, 0, 0.0f);
                }
                return Unit.INSTANCE;
            default:
                AbstractC3698e abstractC3698e4 = (AbstractC3698e) obj;
                ArrayList arrayList4 = this.f19553e;
                int size3 = arrayList4.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    AbstractC3698e.smaato(abstractC3698e4, (AbstractC2832e) arrayList4.get(i4), 0, 0, null, 12);
                }
                return Unit.INSTANCE;
        }
    }
}
