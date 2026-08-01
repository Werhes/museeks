package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۤؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7571e extends AbstractC15890e {
    public final /* synthetic */ LinkedHashSet billing;
    public final /* synthetic */ InterfaceC13521e purchase;
    public final /* synthetic */ boolean yandex;

    public C7571e(InterfaceC13521e interfaceC13521e, LinkedHashSet linkedHashSet, boolean z) {
        this.purchase = interfaceC13521e;
        this.billing = linkedHashSet;
        this.yandex = z;
    }

    public static /* synthetic */ void purchase(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC15890e
    public final void ad(InterfaceC0390e interfaceC0390e) {
        if (interfaceC0390e == null) {
            purchase(0);
            throw null;
        }
        C14514e.subscription(interfaceC0390e, new C17877e(13, this));
        this.billing.add(interfaceC0390e);
    }

    @Override // defpackage.AbstractC15890e
    public final void appmetrica(InterfaceC0390e interfaceC0390e, Collection collection) {
        if (interfaceC0390e == null) {
            purchase(3);
            throw null;
        }
        if (!this.yandex || interfaceC0390e.mo334e() == 2) {
            interfaceC0390e.mo336e(collection);
        }
    }

    @Override // defpackage.AbstractC15890e
    public final void vip(InterfaceC0390e interfaceC0390e, InterfaceC0390e interfaceC0390e2) {
        if (interfaceC0390e2 != null) {
            return;
        }
        purchase(2);
        throw null;
    }
}
