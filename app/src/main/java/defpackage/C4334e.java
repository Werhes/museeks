package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4334e extends C9405e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ArrayList f9469e;

    @Override // defpackage.C9405e, defpackage.AbstractC8492e
    public void ad(ByteBuffer byteBuffer) {
        C9890e c9890e = new C9890e(new C18529e(byteBuffer), byteBuffer);
        this.f18719e = c9890e.f19504e;
        this.f9469e = c9890e.f19503e;
    }

    @Override // defpackage.C9405e, defpackage.AbstractC8492e
    public final EnumC8701e metrica() {
        return EnumC8701e.IMPLICIT;
    }

    @Override // defpackage.C9405e, defpackage.AbstractC8492e
    public final byte[] vip() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = this.f9469e.iterator();
        while (it.hasNext()) {
            try {
                short shortValue = ((Short) it.next()).shortValue();
                C7936e c7936e = AbstractC1983e.ad;
                byteArrayOutputStream.write(new byte[]{(byte) ((shortValue >> 8) & 255), (byte) (shortValue & 255)});
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
