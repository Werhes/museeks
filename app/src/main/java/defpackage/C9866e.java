package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9866e implements InterfaceC8528e {
    public final String vip;

    public C9866e(int i, String... strArr) {
        String str;
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.vip = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // defpackage.InterfaceC8528e
    public /* bridge */ /* synthetic */ Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        return yandex(c0520e);
    }

    @Override // defpackage.InterfaceC7192e
    public InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        return new C13263e(C0520e.billing(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c0520e}, 1))));
    }

    @Override // defpackage.InterfaceC8528e
    public Set billing() {
        return C3295e.f7451e;
    }

    @Override // defpackage.InterfaceC8528e
    public Set license() {
        return C3295e.f7451e;
    }

    @Override // defpackage.InterfaceC7192e
    public Collection metrica(C4942e c4942e, Function1 function1) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC8528e
    public /* bridge */ /* synthetic */ Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        return startapp(c0520e);
    }

    public Set startapp(C0520e c0520e) {
        return C18139e.purchase;
    }

    public String toString() {
        return AbstractC4653e.applovin(new StringBuilder("ErrorScope{"), this.vip, '}');
    }

    @Override // defpackage.InterfaceC8528e
    public Set vip() {
        return C3295e.f7451e;
    }

    public Set yandex(C0520e c0520e) {
        C1117e c1117e = new C1117e(C18139e.metrica, null, C4590e.f9885e, C0520e.billing("<Error function>"), 1, InterfaceC3054e.f7112e);
        C3267e vip = C18139e.vip(EnumC16799e.f32904e, new String[0]);
        C8268e c8268e = AbstractC6050e.appmetrica;
        C13664e c13664e = C13664e.f27089e;
        c1117e.mo470e(null, null, c13664e, c13664e, c13664e, vip, 3, c8268e);
        return Collections.singleton(c1117e);
    }
}
