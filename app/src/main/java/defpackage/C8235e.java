package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًۜۨ;", "Leِٝؓ;", "Leْۣۤ;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًۜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C8235e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Function1 f16718e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16401e f16719e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final String f16720e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC12732e f16721e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2815e f16722e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function1 f16723e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C1367e f16724e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14542e f16725e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC2872e f16726e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC8079e f16727e;

    public C8235e(C14542e c14542e, InterfaceC12732e interfaceC12732e, C16401e c16401e, Function1 function1, Function1 function12, InterfaceC8079e interfaceC8079e, InterfaceC2872e interfaceC2872e, C2815e c2815e, C1367e c1367e, String str) {
        this.f16725e = c14542e;
        this.f16721e = interfaceC12732e;
        this.f16719e = c16401e;
        this.f16723e = function1;
        this.f16718e = function12;
        this.f16727e = interfaceC8079e;
        this.f16726e = interfaceC2872e;
        this.f16722e = c2815e;
        this.f16724e = c1367e;
        this.f16720e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8235e)) {
            return false;
        }
        C8235e c8235e = (C8235e) obj;
        return this.f16725e.equals(c8235e.f16725e) && AbstractC7890e.billing(this.f16721e, c8235e.f16721e) && AbstractC7890e.billing(this.f16719e, c8235e.f16719e) && AbstractC7890e.billing(this.f16723e, c8235e.f16723e) && AbstractC7890e.billing(this.f16718e, c8235e.f16718e) && AbstractC7890e.billing(this.f16727e, c8235e.f16727e) && AbstractC7890e.billing(this.f16726e, c8235e.f16726e) && Float.compare(1.0f, 1.0f) == 0 && AbstractC7890e.billing(this.f16722e, c8235e.f16722e) && AbstractC7890e.billing(this.f16724e, c8235e.f16724e) && AbstractC7890e.billing(this.f16720e, c8235e.f16720e);
    }

    public final int hashCode() {
        int hashCode = (this.f16723e.hashCode() + ((this.f16719e.hashCode() + ((this.f16721e.hashCode() + (this.f16725e.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.f16718e;
        int license = AbstractC1414e.license((this.f16726e.hashCode() + ((this.f16727e.hashCode() + ((((hashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + 1) * 31)) * 31)) * 31, 1.0f, 31);
        C2815e c2815e = this.f16722e;
        int hashCode2 = (((license + (c2815e == null ? 0 : c2815e.hashCode())) * 31) + 1231) * 31;
        C1367e c1367e = this.f16724e;
        int hashCode3 = (hashCode2 + (c1367e == null ? 0 : c1367e.hashCode())) * 31;
        String str = this.f16720e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.f16725e);
        sb.append(", imageLoader=");
        sb.append(this.f16721e);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.f16719e);
        sb.append(", transform=");
        sb.append(this.f16723e);
        sb.append(", onState=");
        sb.append(this.f16718e);
        sb.append(", filterQuality=");
        sb.append("Low");
        sb.append(", alignment=");
        sb.append(this.f16727e);
        sb.append(", contentScale=");
        sb.append(this.f16726e);
        sb.append(", alpha=1.0, colorFilter=");
        sb.append(this.f16722e);
        sb.append(", clipToBounds=true, previewHandler=");
        sb.append(this.f16724e);
        sb.append(", contentDescription=");
        return AbstractC1786e.signatures(sb, this.f16720e, ")");
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        C16401e c16401e = this.f16719e;
        InterfaceC12732e interfaceC12732e = this.f16721e;
        C14542e c14542e = this.f16725e;
        C1097e c1097e = new C1097e(interfaceC12732e, c14542e, c16401e);
        C13108e c13108e = new C13108e(c1097e);
        c13108e.f26052e = this.f16723e;
        c13108e.f26056e = this.f16718e;
        c13108e.f26059e = this.f16726e;
        c13108e.f26060e = 1;
        c13108e.f26058e = this.f16724e;
        c13108e.loadAd(c1097e);
        InterfaceC10819e interfaceC10819e = c14542e.subscription;
        return new C13598e(c13108e, this.f16727e, this.f16726e, this.f16722e, this.f16720e, interfaceC10819e instanceof C5715e ? (C5715e) interfaceC10819e : null);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C13598e c13598e = (C13598e) abstractC13616e;
        long startapp = c13598e.f26985e.startapp();
        C5715e c5715e = c13598e.f26980e;
        C16401e c16401e = this.f16719e;
        InterfaceC12732e interfaceC12732e = this.f16721e;
        C14542e c14542e = this.f16725e;
        C1097e c1097e = new C1097e(interfaceC12732e, c14542e, c16401e);
        C13108e c13108e = c13598e.f26985e;
        c13108e.f26052e = this.f16723e;
        c13108e.f26056e = this.f16718e;
        InterfaceC2872e interfaceC2872e = this.f16726e;
        c13108e.f26059e = interfaceC2872e;
        c13108e.f26060e = 1;
        c13108e.f26058e = this.f16724e;
        c13108e.loadAd(c1097e);
        boolean vip = C2108e.vip(startapp, c13108e.startapp());
        c13598e.f26983e = this.f16727e;
        InterfaceC10819e interfaceC10819e = c14542e.subscription;
        c13598e.f26980e = interfaceC10819e instanceof C5715e ? (C5715e) interfaceC10819e : null;
        c13598e.f26984e = interfaceC2872e;
        c13598e.f26982e = 1.0f;
        c13598e.f26981e = this.f16722e;
        c13598e.f26986e = true;
        String str = c13598e.f26987e;
        String str2 = this.f16720e;
        if (!AbstractC7890e.billing(str, str2)) {
            c13598e.f26987e = str2;
            AbstractC15118e.appmetrica(c13598e);
        }
        boolean billing = AbstractC7890e.billing(c5715e, c13598e.f26980e);
        if (!vip || !billing) {
            AbstractC1599e.purchase(c13598e);
        }
        AbstractC12640e.advert(c13598e);
    }
}
