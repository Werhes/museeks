package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2618e extends AbstractC1675e {
    public final Object license;
    public final /* synthetic */ int metrica = 1;

    public C2618e(C17681e c17681e, String str) {
        super(null, str);
        this.license = c17681e;
    }

    public C2618e(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.license = str;
    }

    @Override // defpackage.AbstractC1675e
    public final InterfaceC10459e ad(Object obj, CharSequence charSequence, int i, int i2) {
        switch (this.metrica) {
            case 0:
                String obj2 = charSequence.subSequence(i, i2).toString();
                String str = (String) this.license;
                if (AbstractC7890e.billing(obj2, str)) {
                    return null;
                }
                return new C6140e(str, 2);
            default:
                int i3 = i2 - i;
                if (i3 < 1) {
                    return new C5401e(1, 11, (byte) 0);
                }
                if (i3 > 9) {
                    return new C5401e(9, 12, (byte) 0);
                }
                C17681e c17681e = (C17681e) this.license;
                int i4 = 0;
                while (i < i2) {
                    i4 = (i4 * 10) + (charSequence.charAt(i) - '0');
                    i++;
                }
                Object ad = c17681e.ad(obj, new C2403e(i4, i3));
                if (ad == null) {
                    return null;
                }
                return new C13935e(ad);
        }
    }
}
