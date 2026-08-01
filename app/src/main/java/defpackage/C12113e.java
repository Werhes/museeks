package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C12113e extends AbstractC7723e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f24276e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24277e = 1;

    public C12113e(AbstractC7723e abstractC7723e) {
        abstractC7723e.getClass();
        this.f24276e = abstractC7723e;
    }

    public C12113e(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f24276e = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.InterfaceC11801e
    public final boolean apply(Object obj) {
        switch (this.f24277e) {
            case 0:
                return metrica(((Character) obj).charValue());
            default:
                return metrica(((Character) obj).charValue());
        }
    }

    @Override // defpackage.AbstractC7723e
    public AbstractC7723e license() {
        switch (this.f24277e) {
            case 1:
                return (AbstractC7723e) this.f24276e;
            default:
                return super.license();
        }
    }

    @Override // defpackage.AbstractC7723e
    public final boolean metrica(char c) {
        switch (this.f24277e) {
            case 0:
                return Arrays.binarySearch((char[]) this.f24276e, c) >= 0;
            default:
                return !((AbstractC7723e) this.f24276e).metrica(c);
        }
    }

    public final String toString() {
        switch (this.f24277e) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) this.f24276e) {
                    sb.append(AbstractC7723e.ad(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((AbstractC7723e) this.f24276e) + ".negate()";
        }
    }
}
