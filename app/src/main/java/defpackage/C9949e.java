package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;
import androidx.car.app.hardware.info.EnergyProfile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۨۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9949e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4320e f19662e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19663e;

    public /* synthetic */ C9949e(C4320e c4320e, int i) {
        this.f19663e = i;
        this.f19662e = c4320e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19663e) {
            case 0:
                this.f19662e.f9435e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                this.f19662e.f9435e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                C4320e c4320e = this.f19662e;
                try {
                    C0576e c0576e = c4320e.f9438e;
                    Boolean bool = Boolean.FALSE;
                    c0576e.setValue(bool);
                    c4320e.f9437e.setValue(bool);
                    Activity activity = c4320e.f10582e;
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"audio/mpeg"});
                    intent.setType("audio/mpeg");
                    activity.startActivityForResult(intent, EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(c4320e.f10582e, "Ошибка при открытии системного проводника", 1).show();
                }
                return Unit.INSTANCE;
            default:
                this.f19662e.f9435e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
