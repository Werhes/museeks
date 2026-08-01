package defpackage;

import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9405e extends AbstractC8492e implements InterfaceC16681e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f18719e;

    public C9405e(String str, String str2) {
        super(str);
        this.f18719e = str2;
    }

    @Override // defpackage.AbstractC8492e
    public void ad(ByteBuffer byteBuffer) {
        this.f18719e = new C9890e(new C18529e(byteBuffer), byteBuffer).f19504e;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return this.f18719e.trim().equals(BuildConfig.FLAVOR);
    }

    @Override // defpackage.AbstractC8492e
    public EnumC8701e metrica() {
        return EnumC8701e.TEXT;
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        return this.f18719e;
    }

    @Override // defpackage.AbstractC8492e
    public byte[] vip() {
        return this.f18719e.getBytes(AbstractC4639e.metrica);
    }

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        return this.f18719e;
    }
}
