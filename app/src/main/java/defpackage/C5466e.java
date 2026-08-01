package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5466e extends AbstractC15825e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final EnumC7566e f11734e;

    public C5466e(C15794e c15794e, int i, EnumC7566e enumC7566e) {
        super(c15794e, i);
        this.f11734e = enumC7566e;
        StringBuilder sb = new StringBuilder("%");
        c15794e.license(sb);
        sb.append(true != c15794e.metrica() ? 't' : 'T');
        sb.append(enumC7566e.f15390e);
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: while */
    public final void mo474while(C0423e c0423e, Object obj) {
        C15794e c15794e = (C15794e) this.f31256e;
        StringBuilder sb = (StringBuilder) c0423e.f2468e;
        boolean z = obj instanceof Date;
        EnumC7566e enumC7566e = this.f11734e;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            c15794e.license(sb2);
            sb2.append(true != c15794e.metrica() ? 't' : 'T');
            sb2.append(enumC7566e.f15390e);
            sb.append(String.format(AbstractC9461e.ad, sb2.toString(), obj));
            return;
        }
        char c = enumC7566e.f15390e;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
        sb3.append("%t");
        sb3.append(c);
        C0423e.advert(sb, obj, sb3.toString());
    }
}
