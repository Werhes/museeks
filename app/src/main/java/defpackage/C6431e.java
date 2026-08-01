package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6431e extends AbstractC10986e {
    @Override // defpackage.AbstractC13656e
    public final AbstractC1186e ad(InterfaceC5334e interfaceC5334e) {
        AbstractC13270e amazon = interfaceC5334e.amazon();
        amazon.getClass();
        return amazon.remoteconfig(EnumC3702e.CHAR);
    }

    @Override // defpackage.AbstractC13656e
    public final String toString() {
        String str;
        Object obj = this.ad;
        Integer valueOf = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        switch (charValue) {
            case '\b':
                str = "\\b";
                break;
            case '\t':
                str = "\\t";
                break;
            case '\n':
                str = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(charValue);
                if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                    str = String.valueOf(charValue);
                    break;
                } else {
                    str = "?";
                    break;
                }
            case '\f':
                str = "\\f";
                break;
            case '\r':
                str = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{valueOf, str}, 2));
    }
}
