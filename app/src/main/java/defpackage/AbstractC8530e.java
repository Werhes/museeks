package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8530e implements InterfaceC8528e {
    @Override // defpackage.InterfaceC8528e
    public Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC7192e
    public InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        return null;
    }

    @Override // defpackage.InterfaceC8528e
    public Set billing() {
        Collection metrica = metrica(C4942e.admob, C7247e.f14825e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : metrica) {
            if (obj instanceof C1117e) {
                linkedHashSet.add(((C1117e) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC8528e
    public Set license() {
        return null;
    }

    @Override // defpackage.InterfaceC7192e
    public Collection metrica(C4942e c4942e, Function1 function1) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC8528e
    public Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC8528e
    public Set vip() {
        Collection metrica = metrica(C4942e.Signature, C7247e.f14825e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : metrica) {
            if (obj instanceof C1117e) {
                linkedHashSet.add(((C1117e) obj).getName());
            }
        }
        return linkedHashSet;
    }
}
