package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18167e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f35588e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13182e f35589e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35590e;

    public /* synthetic */ C18167e(C13182e c13182e, String str, int i) {
        this.f35590e = i;
        this.f35589e = c13182e;
        this.f35588e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35590e) {
            case 0:
                C13182e c13182e = this.f35589e;
                c13182e.f26176e.put(this.f35588e, EnumC10584e.f20886e);
                c13182e.isPro();
                return Unit.INSTANCE;
            default:
                C13182e c13182e2 = this.f35589e;
                C11952e c11952e = c13182e2.f26176e;
                String str = this.f35588e;
                if (c11952e.get(str) == EnumC10584e.f20885e) {
                    c11952e.remove(str);
                    InterfaceC8346e applovin = c13182e2.applovin();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : applovin) {
                        AudioTrack audioTrack = (AudioTrack) obj;
                        audioTrack.getClass();
                        if (!AbstractC7890e.billing(AbstractC6914e.billing(audioTrack), str)) {
                            arrayList.add(obj);
                        }
                    }
                    c13182e2.f26175e.setValue(AbstractC8228e.metrica(arrayList));
                } else {
                    c11952e.put(str, EnumC10584e.f20884e);
                }
                c13182e2.isPro();
                return Unit.INSTANCE;
        }
    }
}
