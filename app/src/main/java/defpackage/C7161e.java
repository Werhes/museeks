package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7161e extends AbstractC15890e {
    public final /* synthetic */ AbstractCollection billing;
    public final /* synthetic */ int purchase;

    public /* synthetic */ C7161e(AbstractCollection abstractCollection, int i) {
        this.purchase = i;
        this.billing = abstractCollection;
    }

    public static /* synthetic */ void purchase(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC15890e
    public final void ad(InterfaceC0390e interfaceC0390e) {
        switch (this.purchase) {
            case 0:
                C14514e.subscription(interfaceC0390e, null);
                ((ArrayList) this.billing).add(interfaceC0390e);
                return;
            default:
                if (interfaceC0390e == null) {
                    purchase(0);
                    throw null;
                }
                C14514e.subscription(interfaceC0390e, null);
                ((LinkedHashSet) this.billing).add(interfaceC0390e);
                return;
        }
    }

    @Override // defpackage.AbstractC15890e
    public final void vip(InterfaceC0390e interfaceC0390e, InterfaceC0390e interfaceC0390e2) {
        switch (this.purchase) {
            case 0:
                if (interfaceC0390e2 instanceof AbstractC14957e) {
                    ((AbstractC14957e) interfaceC0390e2).m3895e(C15378e.ad, interfaceC0390e);
                    return;
                }
                return;
            default:
                if (interfaceC0390e2 != null) {
                    return;
                }
                purchase(2);
                throw null;
        }
    }
}
